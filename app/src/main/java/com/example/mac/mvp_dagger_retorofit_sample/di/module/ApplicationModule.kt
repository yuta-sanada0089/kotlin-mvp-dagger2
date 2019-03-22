package com.example.mac.mvp_dagger_retorofit_sample.di.module

import android.app.Application
import com.example.mac.mvp_dagger_retorofit_sample.BaseApp
import com.example.mac.mvp_dagger_retorofit_sample.di.scope.PerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val baseApp: BaseApp) {
    @Provides
    @Singleton
    @PerApplication
    fun provideApplication(): Application {
        return baseApp
    }
}