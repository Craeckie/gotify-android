package com.github.gotify.log;

import android.content.Context;

public class Log {
    private static String TAG = "gotify";

    public static void e(String message) {
        android.util.Log.e(TAG, message);
    }

    public static void e(String message, Throwable e) {
        android.util.Log.e(TAG, message + '\n' + android.util.Log.getStackTraceString(e));
    }

    public static void i(String message) {
        android.util.Log.i(TAG, message);
    }

    public static void i(String message, Throwable e) {
        android.util.Log.i(TAG, message + '\n' + android.util.Log.getStackTraceString(e));
    }

    public static void w(String message) {
        android.util.Log.w(TAG, message);
    }

    public static int w(String message, Throwable e) {
        return android.util.Log.w(TAG, message + '\n' + android.util.Log.getStackTraceString(e));
    }

    public static void clear() {
        Log.clear();
    }
}
