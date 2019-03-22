package com.example.mac.mvp_dagger_retorofit_sample.di.module

import com.example.mac.mvp_dagger_retorofit_sample.api.ApiServiceInterface
import com.example.mac.mvp_dagger_retorofit_sample.ui.about.AboutContract
import com.example.mac.mvp_dagger_retorofit_sample.ui.about.AboutPresenter
import com.example.mac.mvp_dagger_retorofit_sample.ui.list.ListContract
import com.example.mac.mvp_dagger_retorofit_sample.ui.list.ListPresenter
import dagger.Module
import dagger.Provides

@Module
class FragmentModule {

    @Provides
    fun provaideAboutPresenter(): AboutContract.Presenter  {
        return AboutPresenter()
    }

    @Provides
    fun provaideListPresenter(): ListContract.Presenter {
        return ListPresenter()
    }

    @Provides
    fun provideApiService(): ApiServiceInterface {
        return ApiServiceInterface.create()
    }
}