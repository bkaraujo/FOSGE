package br.fosge.tools;

import br.fosge.graphics.Resolution;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class YamlFileTest {

    @Test
    public void testQuery() {
        final var yamlfile = new YamlFile(yaml());
        assertEquals("0.1.0", yamlfile.asString("project.version"));
        assertEquals("Brakeys", yamlfile.asString("project.window.title"));
        assertEquals(Resolution.nHD, yamlfile.asEnum("project.window.resolution", Resolution.class));
        assertEquals("nHD", yamlfile.asString("project.window.resolution"));

        assertTrue(yamlfile.asBoolean("project.graphics.vsync"));
        assertEquals("world", yamlfile.asString("project.scenes.0.layers.0.name"));
        assertEquals("MESH_COMPONENT", yamlfile.asString("project.scenes.0.layers.0.actors.1.components.2.type"));
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
