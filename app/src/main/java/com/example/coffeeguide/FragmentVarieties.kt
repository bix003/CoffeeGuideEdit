package com.example.coffeeguide


import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.fragment.app.Fragment
import java.util.ArrayList

class FragmentVarieties : Fragment() {
    lateinit var v: View
    private var myRecyclerview: RecyclerView? = null
    private var lstVarieties: MutableList<Varieties>? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.varieties_fragment, container, false)
        myRecyclerview = v.findViewById<View>(R.id.recyclerview) as RecyclerView
        val recyclerAdapter = RecyclerViewAdapter(context, lstVarieties)
        myRecyclerview!!.layoutManager = LinearLayoutManager(activity)
        myRecyclerview!!.adapter = recyclerAdapter
        return v
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lstVarieties = ArrayList()
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Mead Raf",
                "Ingredients",
                ".Cream",
                ".Honey",
                ".Espresso",
                "",
                R.drawable.espresso
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Bicerin",
                "Ingredients",
                ".Whipped Cream",
                ".Black Chocolate",
                ".White Chocolate",
                ".Espresso",
                R.drawable.doppio
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Raf Coffee",
                "Ingredients",
                ".Cream",
                ".Vanilla",
                ".Espresso",
                "",

                R.drawable.americano
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Cappuccino",
                "Ingredients ",
                ".Milk foam",
                ".Steamed milk",
                ".Espresso",
                "",
                R.drawable.cappuccino
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "CafeLatte",
                " Ingredients",
                ".Milk foam",
                ".Steamed milk",
                ".Espresso",
                "",
                R.drawable.latte
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Mocha",
                "Ingredients",
                ".Whipped cream",
                ".Steamed milk",
                ".Chocolate",
                ".Espresso",
                R.drawable.mocha
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Vienna Coffee",
                "Ingredients",
                ".Whipped cream",
                ".Espresso",
                "",
                "",
                R.drawable.cortado
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Flat White",
                "Ingredients",
                ".Steamed milk",
                ".Espresso",
                "",
                "",
                R.drawable.flat
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Macchiato",
                "Ingredients",
                ".Milk foam",
                ".Espresso",
                "",
                "",
                R.drawable.machiato
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Con Panna",
                "Ingredients",
                ".Whipped cream",
                ".Espresso",
                "",
                "",
                R.drawable.conpanna
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Chocolate Milk",
                "Ingredients ",
                ".Milk",
                ".Cocoa",
                "",
                "",
                R.drawable.affogato
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Irish Coffee",
                "Ingredients ",
                ".Jigger Irish cream liquor",
                " .hot brewed coffee",
                " .whipped cream",
                ".ground nutmeg",
                R.drawable.irish
            )
        )
    }
}