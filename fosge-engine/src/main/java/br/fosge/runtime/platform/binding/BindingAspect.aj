package br.fosge.runtime.platform.binding;

import br.fosge.Logger;
import br.fosge.runtime.Runtime;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Aspect
public class BindingAspect {
    private static final List<String> skip = new ArrayList<>();

    static {

        Arrays
                .stream(Object.class.getMethods())
                .forEach(m -> skip.add(m.getName()));

        skip.addAll(Arrays.asList(
                "glfwPollEvents",
                "glfwSwapBuffers"
        ));

        skip.addAll(Arrays.asList(
                "glClear",
                "glDrawElements",
                "glProgramUniformMatrix4fv"
        ));

    }

    @Around("execution(* br.fosge.runtime.platform.binding.*.impl..*.*(..))")
    public Object intercept(ProceedingJoinPoint pjp) throws Throwable{
        if (!Runtime.CHECKS) return pjp.proceed();
        // ===============================================================
        // Method skip list
        // ===============================================================
        final var methodName = pjp.getSignature().getName();
        if (skip.contains(methodName)) return pjp.proceed();

        final var name = new StringBuilder(methodName);
        name.append("(");

        final var args = pjp.getArgs();
        if (args != null && args.length > 0) {
            if (methodName.startsWith("glfw")) {

            }
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
            for (Object arg : args) {
                name
                        .append(arg != null ? arg : "null")
                        .append(",");
            }
        }

        // ===============================================================
        // Actual method calling
        // ===============================================================
        final var start = System.nanoTime();
        try {
            return pjp.proceed();
        } finally {
            name.append(")");
            Logger.trace("%s ## %.2f millis", name, (System.nanoTime() - start) * 1e-6);
        }
    }

    private void validateGLFW() {

    }

}
