package com.sunnyweather.android.logic;

import androidx.work.ListenableWorker;

import com.sunnyweather.android.logic.model.Place;
import com.sunnyweather.android.logic.model.PlaceResponse;
import com.sunnyweather.android.logic.network.SunnyWeatherNetwork;

import java.util.List;

import javax.xml.transform.Result;

import okhttp3.Dispatcher;

public class Repository {

    PlaceResponse placeResponse = new PlaceResponse();

    public void searchPlaces(String query){
        liveData();
    }

    public String liveData（Dispatcher.IO){
        String result ;
        List<Place> places;
        try{
            placeResponse = SunnyWeatherNetwork.searchPlaces(query);
            if (placeResponse.getStatus() == "ok"){
                places = PlaceResponse.getPlaces();
                Result success = Result.success(places);
            }else {
                Result failure(new RuntimeException("response status is"+placeResponse.getStatus());
            }
        }catch (Exception e){
            Result.failure<List<Place>>(e);
        }
        return result;
    }
}
