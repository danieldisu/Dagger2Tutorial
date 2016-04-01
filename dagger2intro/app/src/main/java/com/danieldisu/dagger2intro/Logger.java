package com.danieldisu.dagger2intro;

import android.util.Log;

import javax.inject.Inject;

public class Logger {

    @Inject
    public Logger() {
    }

    private final String TAG = "Dagger2Intro";

    public void log(String text) {
        Log.d(TAG, text);
    }

}
