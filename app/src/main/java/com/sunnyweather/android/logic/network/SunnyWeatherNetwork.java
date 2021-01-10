package com.sunnyweather.android.logic.network;

import com.sunnyweather.android.logic.model.PlaceResponse;

import retrofit2.Call;
import retrofit2.Response;

public class SunnyWeatherNetwork {
    private PlaceService placeService = ServiceCreator.create(PlaceService.class);

    public static PlaceResponse searchPlaces(String query){
        return placeService.searchPlaces(query).await();
    }

    private static <T> Call<T> await(){
        final continuation ->{
            class Callback<T> {
                @Override
                public void onResponse(Call<T> call, Response<T> response){
                    String body = (String) response.body();
                    if (body != null){
                        continuation.resume(body);
                    }else {
                        continuation.resumeWithException(RuntimeException("response body is null");
                    }
                }

                @Override
                public void onFailure(Call<T> call,Throwable t){
                    continuation.resumeWithException(t);
                }
        }
        };
    }



}
