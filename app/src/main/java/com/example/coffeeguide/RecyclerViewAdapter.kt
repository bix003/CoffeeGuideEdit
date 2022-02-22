package com.example.coffeeguide

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.coffeeguide.RecyclerViewAdapter.MyViewHolder
import android.widget.TextView

class RecyclerViewAdapter(var mContext: Context?, var mData: List<Varieties>?) :
    RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v: View
        v = LayoutInflater.from(mContext).inflate(R.layout.item_varieties, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = mData!![position].title
        holder.description.text = mData!![position].description
        holder.img.setImageResource(mData!![position].photo)
    }

    override fun getItemCount(): Int {
        return mData!!.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView
        val description: TextView
        val img: ImageView

        init {
            title = itemView.findViewById<View>(R.id.title_text) as TextView
            description = itemView.findViewById<View>(R.id.description_text) as TextView
            img = itemView.findViewById<View>(R.id.circle_img) as ImageView
        }
    }
}