package br.fosge.runtime.platform.binding.glfw;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.runtime.platform.binding.Aspects;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.lwjgl.system.MemoryUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Aspect
public class GLFWAspect {
    private static final List<String> skip = new ArrayList<>();
    private static final List<String> validateGlfwWindow = new ArrayList<>();

    static {

        Arrays
                .stream(Object.class.getMethods())
                .forEach(m -> skip.add(m.getName()));

        skip.addAll(Arrays.asList(
                "glfwPollEvents",
                "glfwSwapBuffers"
        ));

        validateGlfwWindow.addAll(Arrays.asList(
                "glfwShowWindow",
                "glfwHideWindow",
                "glfwDestroyWindow"
        ));

    }

    @Around("execution(* br.fosge.runtime.platform.binding.glfw.impl..*.*(..))")
    public Object intercept(ProceedingJoinPoint pjp) throws Throwable{
        if (!RT.debug) return pjp.proceed();

        final var methodName = pjp.getSignature().getName();
        if (skip.contains(methodName)) return pjp.proceed();
        if (validateGlfwWindow.contains(methodName)) {validateGlfwWindow((long) pjp.getArgs()[0]);}

        return Aspects.timed(pjp);
    }

    private void validateGlfwWindow(long pointer) {
        if (pointer != MemoryUtil.NULL && pointer == RT.Window.handle) return;
        Logger.fatal("Invalid window pointer");
    }
}
