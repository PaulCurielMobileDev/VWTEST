package com.mexicandeveloper.vwtest.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.mexicandeveloper.vwtest.R
import com.mexicandeveloper.vwtest.models.Children

class InfoAdapter(var theInfo: List<Children>) :
    RecyclerView.Adapter<InfoAdapter.InfoViewHolder>() {


    inner class InfoViewHolder(itemView: View) : ViewHolder(itemView) {

        var title: TextView = itemView.findViewById(R.id.tvTitle)
        var author: TextView = itemView.findViewById(R.id.tvAuthor)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InfoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_info, parent, false)
        return InfoViewHolder(view)
    }

    override fun getItemCount() = theInfo.size

    override fun onBindViewHolder(holder: InfoViewHolder, position: Int) {
        val oneInfo = theInfo[position]
        holder.author.text = oneInfo.data?.author ?: "No Author Provide"
        holder.title.text = oneInfo.data?.author ?: "No Title Provide"
    }
}