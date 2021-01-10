package com.sunnyweather.android.logic.model;

import com.google.gson.annotations.SerializedName;

public class RealtimeResponse {
    class Result(Realtime realtime);


    class Realtime(String skycon,Float temperature,@SerializedName("air_quality") AirQuality airQuality);


}
