package com.example.coffeeguide

import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.fragment.app.Fragment
import java.util.ArrayList

class FragmentRatio : Fragment() {
    private lateinit var v: View
    private var myRecyclerview: RecyclerView? = null
    private var lstRatio: MutableList<Varieties>? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.ratio_fragment, container, false)
        myRecyclerview = v.findViewById<View>(R.id.recyclerview) as RecyclerView
        val recyclerAdapter = RecyclerViewAdapter(context, lstRatio)
        myRecyclerview!!.layoutManager = LinearLayoutManager(activity)
        myRecyclerview!!.adapter = recyclerAdapter
        return v
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lstRatio = ArrayList()
        (lstRatio as ArrayList<Varieties>).add(
            Varieties(
                "Lavazza",
                "As far as espresso goes, it seems obvious that the best option would come from an Italian brand.",
                "",
                "",
                "",
                "",
                R.drawable.lavazza
            )
        )
        (lstRatio as ArrayList<Varieties>).add(
            Varieties(
                "Bizzy",
                "It's brewed cold, but its popularity is hot, hot, hot. Bizzy's Coffee sells roasted grounds specifically made for at-home cold brewing.",
                "",
                "",
                "",
                "",
                R.drawable.bizzy
            )
        )
        (lstRatio as ArrayList<Varieties>).add(
            Varieties(
                "La Colombe",
                "One of the most popular brands at the moment, La Colombe is reputable for their high-quality products",
                "",
                "",
                "",
                "",
                R.drawable.colombe
            )
        )
        (lstRatio as ArrayList<Varieties>).add(
            Varieties(
                "Oakland",
                "There's something to be said about keeping it simple with a basic cup of black coffee. But sometimes the mood calls for a novelty flavored latte.",
                "",
                "",
                "",
                "",
                R.drawable.land
            )
        )
        (lstRatio as ArrayList<Varieties>).add(
            Varieties(
                "Stump Town",
                " they provide customers the best of the best in an ethical and sustainable manner.",
                "",
                "",
                "",
                "",
                R.drawable.stumptown
            )
        )
        (lstRatio as ArrayList<Varieties>).add(
            Varieties(
                "Mount Hagen",
                "Mount Hagen's is widely regarded as the best available. It's organic, fair trade, and good enough to convert even the most staunch anti-instant folk.",
                "",
                "",
                "",
                "",
                R.drawable.mounthagen
            )
        )
    }
}