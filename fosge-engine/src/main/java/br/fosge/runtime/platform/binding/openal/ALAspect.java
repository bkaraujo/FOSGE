package br.fosge.runtime.platform.binding.openal;

import br.fosge.RT;
import br.fosge.runtime.platform.binding.Aspects;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Aspect
public class ALAspect {
    private static final List<String> skip = new ArrayList<>();

    static {

        Arrays
                .stream(Object.class.getMethods())
                .forEach(m -> skip.add(m.getName()));

        skip.addAll(Arrays.asList(
                "alGetSource"
        ));

    }

    @Around("execution(* br.fosge.runtime.platform.binding.openal.impl..*.*(..))")
    public Object intercept(ProceedingJoinPoint pjp) throws Throwable {
        if (!RT.debug) return pjp.proceed();

        final var methodName = pjp.getSignature().getName();
        for (final var predicate : skip) {
            if (methodName.startsWith(predicate)) {
                return pjp.proceed();
            }
        }

        return Aspects.timed(pjp);
    }

}
