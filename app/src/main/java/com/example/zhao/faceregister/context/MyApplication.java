package com.example.zhao.faceregister.context;

import android.app.Application;
import android.content.Context;
import org.opencv.android.OpenCVLoader;

public class MyApplication extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        OpenCVLoader.initDebug();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
