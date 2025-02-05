package br.fosge.runtime.platform.binding.opengl;

import br.fosge.RT;
import br.fosge.commons.Logger;
import br.fosge.runtime.platform.binding.Aspects;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Aspect
public class GLAspect {
    private static final List<String> skip = new ArrayList<>();
    private static final List<String> legacy = new ArrayList<>();
    private static final List<String> nondsa = new ArrayList<>();

    static {

        Arrays
                .stream(Object.class.getMethods())
                .forEach(m -> skip.add(m.getName()));

        skip.addAll(Arrays.asList(
                "glClear",
                "glDraw",
                "glProgramUniform",
                "glBind"
        ));

        legacy.addAll(Arrays.asList(
                "glVertex2",
                "glVertex3",
                "glVertex4",
                "glVertexPointer",
                "glRotate",
                "glScale",
                "glMaterial",
                "glLoad",
                "glLight",
                "glColor"
        ));

        nondsa.addAll(Arrays.asList(
                "glGenBuffer",
                "glBufferData",
                "glBufferSubData",
                "glGenTexture",
                "glTexSubImage"
                ));
    }

    @Around("execution(* br.fosge.runtime.platform.binding.opengl.impl..*.*(..))")
    public Object intercept(ProceedingJoinPoint pjp) throws Throwable{
        if (!RT.debug) return pjp.proceed();

        final var methodName = pjp.getSignature().getName();
        for (final var predicate : skip) {
            if (methodName.startsWith(predicate)) {
                return pjp.proceed();
            }
        }

        for (final var predicate : legacy) {
            if (methodName.startsWith(predicate)) {
                Logger.fatal("Do not user legacy functions");
                return pjp.proceed();
            }
        }

        for (final var predicate : nondsa) {
            if (methodName.startsWith(predicate)) {
                Logger.fatal("Please use the DSA version");
                return pjp.proceed();
            }
        }

        return Aspects.timed(pjp);
    }
}
