package com.example.livedataviewmodel


class Contract {

     interface View {

        fun updateAdapterInformation()
    }

    public interface Presenter {
        fun fetchValues()
    }
}