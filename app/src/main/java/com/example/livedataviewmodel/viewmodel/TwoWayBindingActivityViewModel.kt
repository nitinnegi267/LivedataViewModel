package com.example.livedataviewmodel.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TwoWayBindingActivityViewModel : ViewModel() {

    var name = MutableLiveData("Any Initial Value")

}