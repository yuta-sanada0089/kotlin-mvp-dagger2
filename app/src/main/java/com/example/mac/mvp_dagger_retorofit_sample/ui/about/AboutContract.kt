package com.example.mac.mvp_dagger_retorofit_sample.ui.about

import com.example.mac.mvp_dagger_retorofit_sample.ui.base.BaseContract

class AboutContract {

    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun loadMessageSuccess(messge: String)
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadMessage()
    }
}