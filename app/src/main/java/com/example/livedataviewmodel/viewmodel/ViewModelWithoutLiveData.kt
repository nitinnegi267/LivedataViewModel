package com.example.livedataviewmodel.viewmodel

import androidx.lifecycle.ViewModel

class ViewModelWithoutLiveData : ViewModel() {

    private var name = "Initial name"

    fun updateName(value: String) {
        name = value
    }

    fun getName() : String{
        return name
    }

}