package com.sunnyweather.android.logic.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceCreator {
    private String BASE_URL="https://api.caiyunapp.com/";
    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    static Class<T> create(Class<PlaceService> serviceClass){
        T = retrofit.create(serviceClass);
    }

    Reified<reified T> create(){

    }
}
