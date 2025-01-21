package com.example.livedataviewmodel.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.livedataviewmodel.R
import com.example.livedataviewmodel.databinding.BindingActivityBinding
import com.example.livedataviewmodel.viewmodel.BindingActivityViewModel

class BindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel by viewModels<BindingActivityViewModel>()

        val binding: BindingActivityBinding = DataBindingUtil.setContentView(
            this, R.layout.binding_activity
        )

        binding.viewmodel = viewModel
        binding.lifecycleOwner = this // lifecycle owner not working with Component Activity.

        binding.buttonInBinding.setOnClickListener {
            viewModel.updateValue("Value from Binding")
        }
    }
}
