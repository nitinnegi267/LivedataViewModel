package com.example.livedataviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MyPresenter {

    private val _name = MutableLiveData("Any Initial Value")

    val name: LiveData<String> = _name

    fun updateValue(value: String) {
        _name.value = value
    }
}