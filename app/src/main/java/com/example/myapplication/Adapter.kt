package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val list:List<Data>, private val context: Context, private val viewModel:MyViewModel) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        var view = LayoutInflater.from(context).
        inflate(R.layout.recyclerview_item,parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        var textview = holder.itemView.findViewById<TextView>(R.id.recyclerview_text)
        textview.text = list[position].text
        textview.setOnClickListener{
              viewModel.update(list[position])
        }

    }

    var xxx = 12

    inner class MyViewHolder(view: View):RecyclerView.ViewHolder(view){

        var yyy =xxx



    }
}