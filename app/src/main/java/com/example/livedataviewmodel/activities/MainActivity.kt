package com.example.livedataviewmodel.activities

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import com.example.livedataviewmodel.MyPresenter
import com.example.livedataviewmodel.R
import com.example.livedataviewmodel.viewmodel.MainActivityViewModel
import com.example.livedataviewmodel.viewmodel.ViewModelWithoutLiveData

class MainActivity : ComponentActivity() {

    private lateinit var mPresenter: MyPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val viewModel by viewModels<MainActivityViewModel>()
        val viewModel1 by viewModels<ViewModelWithoutLiveData>()

        val textView = findViewById<TextView>(R.id.textView)
        val textView1 = findViewById<TextView>(R.id.textView1)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val button = findViewById<TextView>(R.id.button)

        mPresenter = MyPresenter()

        button.setOnClickListener {
            mPresenter.updateValue("Value from MainActivity")
            viewModel.updateValue("Value from MainActivity")
            viewModel1.updateName("Value from MainActivity")
            textView2.text = viewModel1.getName()
        }

        textView2.text = viewModel1.getName()

        mPresenter.name.observe(this) {
            textView.text = it
        }

        viewModel.name.observe(this) {
            textView1.text = it
        }
    }
}
