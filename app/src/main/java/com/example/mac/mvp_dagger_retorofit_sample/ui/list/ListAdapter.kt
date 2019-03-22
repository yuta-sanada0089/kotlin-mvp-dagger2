package com.example.mac.mvp_dagger_retorofit_sample.ui.list

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.mac.mvp_dagger_retorofit_sample.R
import com.example.mac.mvp_dagger_retorofit_sample.models.Post

class ListAdapter(private val context: Context, private val list: MutableList<Post>,
                  fragment: Fragment): RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    private val listener: ListAdapter.onItemClickListener

    init {
        this.listener = fragment as onItemClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ListViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        return ListAdapter.ListViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListViewHolder?, position: Int) {
        val post = list[position]

        holder!!.title!!.setText(post.title)
        holder.body!!.setText(post.id.toString())

        holder.layput!!.setOnClickListener {
            listener.itemDeteil(post.id.toString())
        }
    }

    fun removeAt(position: Int) {
        list.removeAt(position)
        notifyItemRemoved(position)
    }

    class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var layput = itemView.findViewById<ConstraintLayout>(R.id.item_layout)
        val title = itemView.findViewById<TextView>(R.id.item_title)
        val body = itemView.findViewById<TextView>(R.id.item_body)

        fun bind(item: Post) {

        }
    }

    interface onItemClickListener {
        fun itemRemoveClick(post: Post)
        fun itemDeteil(postid: String)
    }
}