package hugo.weaving;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Annotation that will be used for reporting the trace of a method.
 */
@Target({METHOD, CONSTRUCTOR}) @Retention(RUNTIME)
public @interface Trace {

    /**
     * The {@link hugo.weaving.TraceReporter} class that will be used to report the method trace.
     * @return the class
     */
    Class<? extends TraceReporter> value();
}
