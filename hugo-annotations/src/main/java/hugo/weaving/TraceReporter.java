package hugo.weaving;

/**
 * Reports the completion of a method.
 */
public interface TraceReporter {

    /**
     * Reports the name and time a method took to complete.
     * @param methodName the method name
     * @param millis the time it took in millis
     */
    void onMethodCompleted(String methodName, long millis);
}
