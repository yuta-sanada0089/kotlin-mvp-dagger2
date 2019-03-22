package com.example.mac.mvp_dagger_retorofit_sample.di.component

import com.example.mac.mvp_dagger_retorofit_sample.di.module.ActivityModule
import com.example.mac.mvp_dagger_retorofit_sample.ui.main.MainActivity
import dagger.Component

@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
}