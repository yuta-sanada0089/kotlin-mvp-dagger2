package com.example.mac.mvp_dagger_retorofit_sample.di.component

import com.example.mac.mvp_dagger_retorofit_sample.di.module.FragmentModule
import com.example.mac.mvp_dagger_retorofit_sample.ui.about.AboutFragment
import com.example.mac.mvp_dagger_retorofit_sample.ui.list.ListFragment
import dagger.Component

@Component(modules = arrayOf(FragmentModule::class))
interface FragmentComponent {
    fun inject(aboutFragment: AboutFragment)
    fun inject(listFragment: ListFragment)
}