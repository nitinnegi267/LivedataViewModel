package com.example.livedataviewmodel.adapter

import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.example.livedataviewmodel.R

object BindingAdapter {

    @BindingAdapter("app:setLinearLayoutBackgroundColor")
    @JvmStatic
    fun setLinearLayoutBackgroundColor(view: LinearLayout, buttonPressed: Int) {

        when (buttonPressed) {

            1 -> {
                view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.teal_200))
            }

            2 -> {
                view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.purple_200))
            }

            3 -> {
                view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.purple_700))
            }
        }
    }
}