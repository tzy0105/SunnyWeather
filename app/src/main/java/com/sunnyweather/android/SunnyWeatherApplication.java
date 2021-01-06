package com.sunnyweather.android;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class SunnyWeatherApplication extends Application {
    public void object(){
        @SuppressLint("StaticFieldLeak")
        Context context;
        String TOKEN="";
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Context context = getApplicationContext();
    }
}
