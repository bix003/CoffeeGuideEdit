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
                "Espresso",
                " It gives an instant wake me up and is high in caffeine.",
                R.drawable.espresso
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Doppio",
                "A Doppio is a double espresso in a cup. No other ingredient is added to it.",
                R.drawable.doppio
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Americano",
                "It has a high level of caffeine but it is not as strong.",
                R.drawable.americano
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Cappuccino",
                " Cappuccino is more of like an indulgence and comfort other than just the usual wake-me-up caffeine shot.",
                R.drawable.cappuccino
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Latte",
                "Latte is more like the home-made milk coffee that you usually make having very little espresso and more steamed milk and a sweeter of your choice. ",
                R.drawable.latte
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Mocha",
                "Mocha is like an Indulgent coffee and somewhere in between a coffee and hot chocolate.",
                R.drawable.mocha
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Cortado",
                "a cortado is used in the sense of diluting. This is because the milk reduces the acidity of the coffee.",
                R.drawable.cortado
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Flat White",
                "Flat white is actually cappuccino without the chocolate or foam and simply an espresso drink with steamed milk.",
                R.drawable.flat
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Machiato",
                "Milk added is very less while espresso is comparatively more.",
                R.drawable.machiato
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Con Panna",
                "To recreate your favourite Con Panna, extract a shot of espresso into a cup, then add whipped cream on top.",
                R.drawable.conpanna
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "AffoGato",
                " It's usually ordered after dinner as a combination of espresso and ice cream.",
                R.drawable.affogato
            )
        )
        (lstVarieties as ArrayList<Varieties>).add(
            Varieties(
                "Irish Coffee",
                "Irish coffee is  often made with black coffee, whiskey and sugar and topped with cream. ",
                R.drawable.irish
            )
        )
    }
}