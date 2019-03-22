package com.example.mac.mvp_dagger_retorofit_sample.models

import com.google.gson.Gson

data class DetailsViewModel(val posts: List<Post>, val users: List<User>, val album: List<Album>) {
    fun toJson(): String {
        return Gson().toJson(this)
    }
}