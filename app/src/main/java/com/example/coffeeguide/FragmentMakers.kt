package com.example.coffeeguide


import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.fragment.app.Fragment
import java.util.ArrayList

class FragmentMakers : Fragment() {
    private lateinit var v: View
    private var myRecyclerview: RecyclerView? = null
    private var lstMakers: MutableList<Varieties>? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.makers_fragment, container, false)
        myRecyclerview = v.findViewById<View>(R.id.recyclerview) as RecyclerView
        val recyclerAdapter = RecyclerViewAdapter(context, lstMakers)
        myRecyclerview!!.layoutManager = LinearLayoutManager(activity)
        myRecyclerview!!.adapter = recyclerAdapter
        return v
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lstMakers = ArrayList()
        (lstMakers as ArrayList<Varieties>).add(
            Varieties(
                "KenWood CMM 10.000BM",
                "KES 6,495",
                "",
                "",
                "",
                "",
                R.drawable.kenwood
            )
        )
        (lstMakers as ArrayList<Varieties>).add(
            Varieties(
                "Von VSCD 12MVX 12cup",
                "KES 5,750",
                "",
                "",
                "",
                "",
                R.drawable.vonvsd
            )
        )
        (lstMakers as ArrayList<Varieties>).add(
            Varieties(
                "Dolce Gusto Nescafe Mini",
                "KES 13,295",
                "",
                "",
                "",
                "",
                R.drawable.dolce
            )
        )
        (lstMakers as ArrayList<Varieties>).add(
            Varieties(
                "Delonghi ICM 2.1WH Drip",
                "KES 6,495",
                "",
                "",
                "",
                "",
                R.drawable.delonghi
            )
        )
        (lstMakers as ArrayList<Varieties>).add(
            Varieties(
                "Delonghi ICM 2.BWH Drip",
                "KES 6,995",
                "",
                "",
                "",
                "",
                R.drawable.dripcoffee
            )
        )
        (lstMakers as ArrayList<Varieties>).add(
            Varieties(
                "Von VSCD 12MVX Mini 4cup ",
                "KES 3,490",
                "",
                "",
                "",
                "",
                R.drawable.pbrand
            )
        )
    }
}