package com.example.coffeeguide

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.coffeeguide.RecyclerViewAdapter.MyViewHolder
import android.widget.TextView

class RecyclerViewAdapter(private var mContext: Context?, private var mData: List<Varieties>?) :
    RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v: View = LayoutInflater.from(mContext).inflate(R.layout.item_varieties, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = mData!![position].title
        holder.description.text = mData!![position].description
        holder.description2.text = mData!![position].description2
        holder.description3.text = mData!![position].description3
        holder.description4.text = mData!![position].description4
        holder.description5.text = mData!![position].description5
        holder.img.setImageResource(mData!![position].photo)


    }

    override fun getItemCount(): Int {
        return mData!!.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById<View>(R.id.title_text) as TextView
        val description: TextView = itemView.findViewById<View>(R.id.description_text) as TextView
        val description2: TextView = itemView.findViewById<View>(R.id.description2_text) as TextView
        val description3: TextView = itemView.findViewById<View>(R.id.description3_text) as TextView
        val description4: TextView = itemView.findViewById<View>(R.id.description4_text) as TextView
        val description5: TextView = itemView.findViewById<View>(R.id.description5_text) as TextView
        val img: ImageView = itemView.findViewById<View>(R.id.circle_img) as ImageView

    }
}