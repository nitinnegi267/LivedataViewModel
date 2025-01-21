package com.example.livedataviewmodel.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BindingActivityViewModel : ViewModel() {

    private val _name = MutableLiveData("Any Initial Value")
    private val _available = MutableLiveData(false)

    val name: LiveData<String> = _name
    val available: LiveData<Boolean> = _available

    fun updateValue(value: String) {
        _name.value = value
    }

    fun updateAvailability(available: Boolean) {
        _available.value = available
    }
}

