package com.example.mac.mvp_dagger_retorofit_sample.ui.list

import com.example.mac.mvp_dagger_retorofit_sample.models.DetailsViewModel
import com.example.mac.mvp_dagger_retorofit_sample.models.Post
import com.example.mac.mvp_dagger_retorofit_sample.ui.base.BaseContract

class ListContract {
    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun showErrorMessage(error: String)
        fun loadDataSuccess(list: List<Post>)
        fun loadDataAllSuccess(model: DetailsViewModel)
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadData()
        fun loadDataAll()
        fun deleteItem(item: Post)
    }
}