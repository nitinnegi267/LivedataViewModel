package com.example.livedataviewmodel.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OneWayBindingActivityViewModel : ViewModel() {

    var _name = MutableLiveData("Any Initial Value")
    val name: LiveData<String> = _name

    var _buttonPressed = MutableLiveData(0)
    val buttonPressed: LiveData<Int> = _buttonPressed

    fun updateValue(value: String) {
        _name.value = value
    }

    fun buttonPressed(buttonPressed: Int) {
        _buttonPressed.value = buttonPressed
    }

}
