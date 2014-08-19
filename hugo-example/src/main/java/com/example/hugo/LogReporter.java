package com.example.hugo;

import hugo.weaving.TraceReporter;

public class LogReporter implements TraceReporter {

    @Override
    public void onMethodCompleted(String methodName, long millis) {
        System.out.println(methodName + " " + millis);
    }
}
