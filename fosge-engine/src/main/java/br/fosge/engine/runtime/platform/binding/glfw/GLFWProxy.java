package br.fosge.engine.runtime.platform.binding.glfw;

import br.fosge.Logger;
import br.fosge.engine.runtime.Runtime;
import br.fosge.engine.runtime.platform.binding.glfw.api.GLFW34;
import br.fosge.engine.runtime.platform.binding.glfw.impl.GLFW3x;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class GLFWProxy implements InvocationHandler {
    private final List<String> skip = new ArrayList<>();
    private final GLFW34 instance = new GLFW3x();

    public GLFWProxy() {
        Arrays
                .stream(Object.class.getMethods())
                .forEach(m -> skip.add(m.getName()));

        skip.add("glfwPollEvents");
        skip.add("glfwSwapBuffers");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (!Runtime.CHECKS) return method.invoke(proxy, args);
        // ===============================================================
        // Method skip list
        // ===============================================================
        final var methodName = method.getName();
        if (skip.contains(methodName)) return method.invoke(instance, args);

        final var name = new StringBuilder(methodName);
        name.append("(");

        if (args != null) {
            // ===============================================================
            // Parameter validations
            // ===============================================================
//            switch (methodName) {
//                case "glfwShowWindow", "glfwHideWindow", "glfwDestroyWindow" : {
//                    validateArgsLength(1, args.length);
//                    validateWindow((long) args[0]);
//                } break;
//            }
            // ===============================================================
            // Debug string composition
            // ===============================================================
            for (int i = 0; i < args.length - 1; i++) {
                name.append(args[i].getClass().getTypeName());
                name.append(",");
            }
            name.append(args[args.length - 1].getClass().getTypeName());
        }

        // ===============================================================
        // Actual method calling
        // ===============================================================
        final var start = System.nanoTime();
        try {
            return method.invoke(instance, args);
        } finally {
            name.append(")");
            Logger.trace("%s ## %.2f millis", name, (System.nanoTime() - start) * 1e-6);
        }
    }
}
