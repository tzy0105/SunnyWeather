package com.sunnyweather.android.ui.place

import androidx.lifecycle.*
import androidx.lifecycle.Transformations.switchMap

import com.sunnyweather.android.logic.Repository
import com.sunnyweather.android.logic.dao.PlaceDao
import com.sunnyweather.android.logic.model.Place

class PlaceViewModel : ViewModel() {

    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData = switchMap(searchLiveData) { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }

    fun savePlace(place: Place)=Repository.savePlace(place)

    fun getSavedPlace()= PlaceDao.getSavedPlace()

    fun isPlaceSaved()= PlaceDao.isPlacesSaved()

}