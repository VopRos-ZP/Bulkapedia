package com.bulkapedia.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val hero = MutableLiveData<HeroModel>()
    val map = MutableLiveData<MapModel>()
}