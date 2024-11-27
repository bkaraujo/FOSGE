//package br.brakeys;
//
//import br.fosge.Logger;
//import br.fosge.MessageBus;
//import br.fosge.audio.AudioBuffer;
//import br.fosge.graphics.DataType;
//import br.fosge.graphics.DrawMode;
//import br.fosge.graphics.Shader;
//import br.fosge.graphics.Texture;
//import br.fosge.graphics.geometry.BufferLayout;
//import br.fosge.graphics.geometry.BufferType;
//import br.fosge.graphics.geometry.GeometrySpec;
//import br.fosge.graphics.shader.ShaderSpec;
//import br.fosge.input.Keyboard;
//import br.fosge.runtime.*;
//import br.fosge.runtime.platform.window.WindowClosedEvent;
//import br.fosge.runtime.scene.Actor;
//import br.fosge.runtime.scene.Camera2D;
//import br.fosge.scene.Camera;
//import br.fosge.scene.Camera2DSpec;
//
//public class SandboxLayer implements Layer {
//    private AudioBuffer audioJump;
//
//    private Shader shader;
//    private Texture texture;
//
//    private final float speed = 1f;
//    private Actor left;
//    private Actor right;
//    private Actor ball;
//    private Camera camera;
//
//    @Override
//    public boolean initialize() {
//        {
//            left = Actor.create();
//
//            if (!left.initialize() || !left.configure(new GeometrySpec(
//                    DrawMode.TRIANGLE,
//                    DataType.UINT,
//                    new BufferLayout("in_position", BufferType.FLOAT3),
//                    new BufferLayout("in_uv", BufferType.FLOAT2)
//            ))) {
//                Logger.error("Failed to configure geometry");
//                return false;
//            }
//
//            left.geometry().elements(
//                    0, 1, 3,   // first triangle
//                    1, 2, 3    // second triangle
//            );
//
////            left.geometry().vertices(
////                     0.02f,  0.300f, 0.0f,   1.0f, 1.0f,// top right
////                     0.02f, -0.025f, 0.0f,   1.0f, 0.0f,// bottom right
////                    -0.00f, -0.025f, 0.0f,   0.0f, 0.0f,// bottom left
////                    -0.00f,  0.003f, 0.0f,   0.0f, 1.0f // top left
////            );
//
//            left.geometry().vertices(
//                    // positions         // texture coords
//                     0.5f,  0.5f, 0.0f,  1.0f, 1.0f,   // top right
//                     0.5f, -0.5f, 0.0f,  1.0f, 0.0f,   // bottom right
//                    -0.5f, -0.5f, 0.0f,  0.0f, 0.0f,   // bottom left
//                    -0.5f,  0.5f, 0.0f,  0.0f, 1.0f    // top left
//            );
//        }
//
//        shader = Graphics.shader();
//        if (!shader.initialize() || !shader.configure(new ShaderSpec(
//                Resources.shaderSource("assets/shader/basic")
//        ))) {
//            Logger.error("Failed to configure shader");
//            return false;
//        }
//
//        audioJump = Resources.audio("assets/audio/clip/jump.wav");
//
//        texture = Resources.texture2d("assets/texture/container.jpg");
//
//        Graphics.clearColor(0.17f, 0.32f, 0.17f);
//
//        camera = new Camera2D();
//        camera.configure(new Camera2DSpec(3f, 1f));
//
//        return true;
//    }
//
//    @Override
//    public void onSimulate(double step) {
//        if (Input.active(Keyboard.KEY_D)) { left.transform().position().add((float) (speed * step), 0f, 0f); }
//        if (Input.active(Keyboard.KEY_A)) { left.transform().position().add((float) (-speed * step), 0f, 0f); }
//        if (Input.active(Keyboard.KEY_W)) { left.transform().position().add(0f, (float) (speed * step), 0f); }
//        if (Input.active(Keyboard.KEY_S)) { left.transform().position().add(0f, (float) (-speed * step), 0f); }
//    }
//
//    @Override
//    public void onUpdate(double delta) {
//        if (Input.released(Keyboard.KEY_ESCAPE)) {
//            MessageBus.submit(new WindowClosedEvent());
//        }
//
//        if (Input.released(Keyboard.KEY_SPACE)) {
//            Audio.play(audioJump, 1.0f);
//        }
//
//        shader.uniform("un_model", left.transform().matrix());
//        shader.uniform("un_viewProjection", camera.viewProjectionMatrix());
//        Graphics.draw(shader, left.geometry(), texture);
//    }
//
//    @Override
//    public boolean terminate() {
//        // ############################################
//        // Release graphics objects
//        // ############################################
//        if (!left.terminate()) { Logger.error("Failed to terminate geometry"); return false; }
//        if (!shader.terminate()) { Logger.error("Failed to terminate shader"); return false; }
//        // ############################################
//        // Release resources
//        // ############################################
//        if (audioJump != null) { Resources.free(audioJump); audioJump = null; }
//        if (texture != null) { Resources.free(texture); texture = null; }
//
//        return true;
//    }
//}
