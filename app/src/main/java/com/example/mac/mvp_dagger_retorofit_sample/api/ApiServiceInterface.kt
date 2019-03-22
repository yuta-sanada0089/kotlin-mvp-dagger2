package com.example.mac.mvp_dagger_retorofit_sample.api

import com.example.mac.mvp_dagger_retorofit_sample.models.Album
import com.example.mac.mvp_dagger_retorofit_sample.models.Post
import com.example.mac.mvp_dagger_retorofit_sample.models.User
import com.example.mac.mvp_dagger_retorofit_sample.util.Constants
import io.reactivex.Observable
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServiceInterface {

    @GET("albams")
    fun getAlbumList(): Observable<List<Album>>

    @GET("albums/{id}")
    fun getAlbum(@Path("id") id: Int): Observable<Album>

    @DELETE("albums/{id}")
    fun deleteAlbum(@Path("id") id: Int)

    @GET("posts")
    fun getPostList(): Observable<List<Post>>

    @GET("posts/{id}")
    fun getPost(@Path("id") id: Int): Observable<Post>

    @DELETE("post/{id}")
    fun deletePost(@Path("id") id: Int)

    @GET("users")
    fun getUserList(): Observable<List<User>>

    @GET("users/{id}")
    fun getUser(@Path("id") id: Int): Observable<User>

    @DELETE("users/{id}")
    fun deleteUser(@Path("id") id: Int)

    companion object Factory {
        fun create(): ApiServiceInterface {
            val retrofit = retrofit2.Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Constants.BASE_URL)
                .build()

            return retrofit.create(ApiServiceInterface::class.java)
        }
    }

}