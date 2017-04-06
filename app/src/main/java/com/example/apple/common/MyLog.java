package com.example.apple.common;

import android.util.Log;

public class MyLog {

    private static boolean debugV = true;
    private static boolean debugD = true;
    private static boolean debugI = true;
    private static boolean debugW = true;
    private static boolean debugE = true;

    public static void v(String text, String msg) {

        if (debugV) {
            Log.v(text, msg);
        }

    }

    public static void d(String text, String msg) {

        if (debugD) {
            Log.d(text, msg);
        }

    }

    public static void i(String text, String msg) {

        if (debugI) {
            Log.i(text, msg);
        }

    }

    public static void w(String text, String msg) {

        if (debugW) {
            Log.w(text, msg);
        }

    }

    public static void e(String text, String msg) {

        if (debugE) {
            Log.e(text, msg);
        }

    }

}
