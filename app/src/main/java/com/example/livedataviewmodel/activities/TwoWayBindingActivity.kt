package com.example.livedataviewmodel.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.livedataviewmodel.R
import com.example.livedataviewmodel.databinding.TwoWayBindingActivityBinding
import com.example.livedataviewmodel.viewmodel.TwoWayBindingActivityViewModel

class TwoWayBindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel by viewModels<TwoWayBindingActivityViewModel>()

        val binding: TwoWayBindingActivityBinding = DataBindingUtil.setContentView(
            this, R.layout.two_way_binding_activity
        )

        binding.viewmodel = viewModel
        binding.lifecycleOwner = this // lifecycle owner not working with Component Activity.
    }
}
// Home Work implement with CheckBox.