package com.example.livedataviewmodel.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.livedataviewmodel.R
import com.example.livedataviewmodel.databinding.OneWayBindingActivityBinding
import com.example.livedataviewmodel.viewmodel.OneWayBindingActivityViewModel

class OneWayBindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel by viewModels<OneWayBindingActivityViewModel>()

        val binding: OneWayBindingActivityBinding = DataBindingUtil.setContentView(
            this, R.layout.one_way_binding_activity
        )

        binding.viewmodel = viewModel
        binding.lifecycleOwner = this // lifecycle owner not working with Component Activity.

        binding.buttonInBinding.setOnClickListener {
            viewModel.updateValue("Value from Binding")
        }

        binding.btn1.setOnClickListener {
            viewModel.buttonPressed(1)
        }
        binding.btn2.setOnClickListener {
            viewModel.buttonPressed(2)
        }
        binding.btn3.setOnClickListener {
            viewModel.buttonPressed(3)
        }
    }
}
