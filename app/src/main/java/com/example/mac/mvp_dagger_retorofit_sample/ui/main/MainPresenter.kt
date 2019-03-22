package com.example.mac.mvp_dagger_retorofit_sample.ui.main

import io.reactivex.disposables.CompositeDisposable

class MainPresenter: MainContract.Presenter {

    private val subscriptions = CompositeDisposable()
    private lateinit var view: MainContract.View

    override fun attach(view: MainContract.View) {
        this.view = view
    }

    override fun unsubscribe() {
        subscriptions.clear()
    }

    override fun subscribe() {

    }

    override fun onDrawerOptionAboutClick() {
        view.showAboutFragment()
    }
}