package com.sunnyweather.android.ui.place;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.sunnyweather.android.logic.Repository;
import com.sunnyweather.android.logic.model.Place;

import java.util.ArrayList;

public class PlaceViewModel extends ViewModel {
    private MutableLiveData<String> searchLiveData = new MutableLiveData<String>();
    Repository repository = new Repository();
    ArrayList<Place> placeList = new ArrayList<Place>();

    String placeLiveData = Transformations.switchMap(searchLiveData){
        String query ;
        repository.searchPlaces(query);
    }

    public void searchPlaces(String query){
        searchLiveData.setValue(query);
    }

}
