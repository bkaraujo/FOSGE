package br.fosge.runtime.platform.binding;

import br.fosge.commons.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

public abstract class Aspects {
    private Aspects(){}

    public static Object timed(ProceedingJoinPoint pjp) throws Throwable {
        final var functionSignature = new StringBuilder(pjp.getSignature().getName());
        functionSignature.append("(");
        Arrays.stream(pjp.getArgs()).forEach(arg -> functionSignature.append(arg).append(", "));

        final var start = System.nanoTime();
        try { return pjp.proceed(); }
        finally {
            functionSignature.append(")");
            Logger.trace("%s ## %.4f millis", functionSignature, (System.nanoTime() - start) * 1e-6);
        }
    }
}
