package com.example.mac.mvp_dagger_retorofit_sample.di.component

import com.example.mac.mvp_dagger_retorofit_sample.BaseApp
import com.example.mac.mvp_dagger_retorofit_sample.di.module.ApplicationModule
import dagger.Component

@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(application: BaseApp)
}