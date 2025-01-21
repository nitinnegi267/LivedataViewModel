package com.example.livedataviewmodel.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private val _name = MutableLiveData("Any Initial Value")

    val name: LiveData<String> = _name

    fun updateValue(value: String) {
        _name.value = value
    }

}

