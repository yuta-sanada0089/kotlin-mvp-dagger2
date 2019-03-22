package com.example.mac.mvp_dagger_retorofit_sample.ui.main

import com.example.mac.mvp_dagger_retorofit_sample.ui.base.BaseContract

class MainContract {
    interface View: BaseContract.View {
        fun showAboutFragment()
        fun showListFragment()
    }

    interface Presenter: BaseContract.Presenter<MainContract.View> {
        fun onDrawerOptionAboutClick()
    }
}