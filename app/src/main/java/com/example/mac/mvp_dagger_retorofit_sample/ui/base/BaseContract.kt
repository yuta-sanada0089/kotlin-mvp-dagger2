package com.example.mac.mvp_dagger_retorofit_sample.ui.base

class BaseContract {
    interface  Presenter<in T> {
        fun subscribe()
        fun unsubscribe()
        fun attach(view: T)
    }

    interface View {

    }
}