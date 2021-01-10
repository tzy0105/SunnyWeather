package com.sunnyweather.android;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class SunnyWeatherApplication extends Application {

    public static final String TOKEN = "JmGUqoedzLZIHrKt";

    @SuppressLint("StaticFieldLeak")
    Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}
