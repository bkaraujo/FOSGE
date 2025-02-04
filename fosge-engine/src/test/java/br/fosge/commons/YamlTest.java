package br.fosge.commons;

import br.fosge.FSTest;
import br.fosge.commons.graphics.Resolution;
import br.fosge.commons.serializer.Yaml;
import br.fosge.commons.serializer.YamlEntry;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class YamlTest {

    @Test
    public void testYamlFactories() {
        var yaml = Yaml.empty();
        assertTrue(yaml.isEmpty());
        assertNull(yaml.folder());

        yaml = Yaml.from(new HashMap<>());
        assertTrue(yaml.isEmpty());
        assertNull(yaml.folder());

        yaml = Yaml.from(Path.of(System.getProperty("user.dir"), "application.yaml"));
        assertTrue(yaml.isEmpty());
        assertNull(yaml.folder());

        yaml = Yaml.from(FSTest.resFS.resolve("empty.yml"));
        assertTrue(yaml.isEmpty());
        assertEquals(FSTest.resFS, yaml.folder());

        yaml = Yaml.from(FSTest.resFS.resolve("fake.yml"));
        assertTrue(yaml.isEmpty());
        assertNull(yaml.folder());
    }

    @Test
    public void testYamlClear() {
        var yaml = Yaml.from(FSTest.resFS.resolve("pong.yml"));
        assertFalse(yaml.isEmpty());
        assertEquals(FSTest.resFS, yaml.folder());

        yaml.clear();
        assertTrue(yaml.isEmpty());
        assertEquals(FSTest.resFS, yaml.folder());
    }

    @Test
    public void testQuery() {
        final var yaml = Yaml.from(yaml());
        assertTrue(yaml.contains("project.version"));
        assertFalse(yaml.contains("project.fafifo"));
        assertEquals("0.1.0", yaml.asString("project.version"));
        assertEquals("Brakeys", yaml.asString("project.window.title"));
        assertEquals(Resolution.nHD, yaml.asEnum("project.window.resolution", Resolution.class));
        assertEquals("nHD", yaml.asString("project.window.resolution"));

        assertTrue(yaml.asBoolean("project.graphics.vsync"));
        assertEquals("world", yaml.asString("project.scenes.0.layers.0.name"));
        assertEquals("MESH_COMPONENT", yaml.asString("project.scenes.0.layers.0.actors.1.components.2.type"));
    }

    @Test
    public void testSliceOfMap() {
        final var yaml = Yaml.from(yaml());
        final var subtree = yaml.subtree("project.window");

        assertEquals("Brakeys", subtree.asString("title"));
        assertEquals(Resolution.nHD, subtree.asEnum("resolution", Resolution.class));
        assertEquals("nHD", subtree.asString("resolution"));
    }

    @Test
    public void testSliceOfList() {
        final var yaml = Yaml.from(yaml());
        final var subtree = yaml.subtree("project.scenes.0.layers");

        assertEquals("world", subtree.asString("layers.0.name"));
        assertEquals("MESH_COMPONENT", subtree.asString("layers.0.actors.1.components.2.type"));
    }

    @Test
    public void testSliceOfListItem() {
        final var yaml = Yaml.from(yaml());
        final var subtree = yaml.subtree("project.scenes.0.layers.0");

        assertEquals("world", subtree.asString("name"));
    }

    @Test
    public void testYamlPutValue() {
        final var yaml = Yaml.empty();
        yaml.put("schema", "1.0.0");
        yaml.put("project.version", "1.0.0");
        assertEquals("1.0.0", yaml.asString("project.version"));

        yaml.put("project.window.title", "Fafifo");
        assertEquals("Fafifo", yaml.asString("project.window.title"));

        yaml.put("project.window.resolution", Resolution.QHD);
        assertEquals(Resolution.QHD, yaml.asEnum("project.window.resolution", Resolution.class));

        yaml.put("project.window.resolution", Resolution.qHD);
        assertEquals(Resolution.qHD, yaml.asEnum("project.window.resolution", Resolution.class));

        yaml.append("project.scenes", new YamlEntry("name", "Scene 01"));
        assertEquals("Scene 01", yaml.asString("project.scenes.0.name"));
    }

    @Test
    public void testYamlPutIntoList() {
        final var yaml = Yaml.empty();

        yaml.append("project.scenes", new YamlEntry("name", "Scene 01"));
        assertEquals("Scene 01", yaml.asString("project.scenes.0.name"));
    }

    @Test
    public void testYamlPutIntoRootList() {
        final var yaml = Yaml.empty();

        yaml.append("projects", "path", "xxxx");
        assertEquals("xxxx", yaml.asString("projects.0.path"));
    }

    @Test
    public void testYamlPutIntoSubTree() {
        final var yaml = Yaml.empty();
        yaml.put("project.version", "1.0.0");
        assertEquals("1.0.0", yaml.asString("project.version"));

        yaml.put("project.window.title", "Fafifo");
        assertEquals("Fafifo", yaml.asString("project.window.title"));

        final var sublist = yaml.subtree("project.window");
        sublist.append("border", "catupiry");

        assertEquals("catupiry", yaml.asString("project.window.border"));
    }

    @Test
    public void testYamlCreateListAndAppendToIt() {
        final var yaml = Yaml.empty();

        yaml.append("projects", "path", "xxxx");
        assertEquals("xxxx", yaml.asString("projects.0.path"));

        yaml.put("projects.0.name", "kkk");
        assertEquals("kkk", yaml.asString("projects.0.name"));
    }

    private Map<String, Object> yaml() {
        final var project = new HashMap<String, Object>();
        project.put("version", "0.1.0");

        final var window = new HashMap<String, Object>();
        window.put("title", "Brakeys");
        window.put("resolution", "nHD");
        project.put("window", window);

        final var graphics = new HashMap<String, Object>();
        graphics.put("vsync", true);
        project.put("graphics", graphics);

        final var scenes = new ArrayList<>();
        project.put("scenes", scenes);

        final var firstScene = new HashMap<String, Object>();
        scenes.add(firstScene);
        firstScene.put("name", "First Scene");
        firstScene.put("clearColor", "0.17 0.32 0.17 1.0");

        final var camera = new HashMap<String, Object>();
        firstScene.put("camera", camera);
        final var frustum = new HashMap<String, Object>();
        camera.put("frustum", frustum);
        frustum.put("depth", "-1.0 1.0");
        frustum.put("nearPlane", "-3.0 3.0 -3.0 3.0");
        frustum.put("farPlane", "-3.0 3.0 -3.0 3.0");

        final var firstSceneLayers = new ArrayList<>();
        firstScene.put("layers", firstSceneLayers);

        final var firstSceneLayerWorld = new HashMap<String, Object>();
        firstSceneLayerWorld.put("name", "world");
        firstSceneLayers.add(firstSceneLayerWorld);

        final var firstSceneLayerWorldActors = new ArrayList<>();
        firstSceneLayerWorld.put("actors", firstSceneLayerWorldActors);

        final var firstSceneLayerWorldActorEnvironment = new HashMap<String, Object>();
        firstSceneLayerWorldActors.add(firstSceneLayerWorldActorEnvironment);
        firstSceneLayerWorldActorEnvironment.put("name", "environment");

        final var firstSceneLayerWorldActorEnvironmentComponents = new ArrayList<>();
        firstSceneLayerWorldActorEnvironment.put("components", firstSceneLayerWorldActorEnvironmentComponents);
        final var firstSceneLayerWorldActorEnvironmentComponentAudioSource = new HashMap<String, Object>();
        firstSceneLayerWorldActorEnvironmentComponents.add(firstSceneLayerWorldActorEnvironmentComponentAudioSource);
        firstSceneLayerWorldActorEnvironmentComponentAudioSource.put("type", "AUDIO_SOURCE_COMPONENT");
        final var firstSceneLayerWorldActorEnvironmentComponentBehaviour = new HashMap<String, Object>();
        firstSceneLayerWorldActorEnvironmentComponents.add(firstSceneLayerWorldActorEnvironmentComponentBehaviour);
        firstSceneLayerWorldActorEnvironmentComponentBehaviour.put("type", "BEHAVIOUR_COMPONENT");


        final var firstSceneLayerWorldActorPlayerLeft = new HashMap<String, Object>();
        firstSceneLayerWorldActors.add(firstSceneLayerWorldActorPlayerLeft);
        firstSceneLayerWorldActorPlayerLeft.put("name", "Left");
        final var firstSceneLayerWorldActorPlayerLeftComponents = new ArrayList<>();
        firstSceneLayerWorldActorPlayerLeft.put("components", firstSceneLayerWorldActorPlayerLeftComponents);
        final var firstSceneLayerWorldActorPlayerLeftComponentAudioSource = new HashMap<String, Object>();
        firstSceneLayerWorldActorPlayerLeftComponents.add(firstSceneLayerWorldActorPlayerLeftComponentAudioSource);
        firstSceneLayerWorldActorEnvironmentComponentAudioSource.put("type", "AUDIO_SOURCE_COMPONENT");
        final var firstSceneLayerWorldActorPlayerLeftComponentBehaviour = new HashMap<String, Object>();
        firstSceneLayerWorldActorPlayerLeftComponents.add(firstSceneLayerWorldActorPlayerLeftComponentBehaviour);
        firstSceneLayerWorldActorEnvironmentComponentBehaviour.put("type", "BEHAVIOUR_COMPONENT");
        final var firstSceneLayerWorldActorPlayerLeftComponentMesh = new HashMap<String, Object>();
        firstSceneLayerWorldActorPlayerLeftComponents.add(firstSceneLayerWorldActorPlayerLeftComponentMesh);
        firstSceneLayerWorldActorPlayerLeftComponentMesh.put("type", "MESH_COMPONENT");

        final var yaml = new HashMap<String, Object>();
        yaml.put("project", project);

        return yaml;
    }

}
