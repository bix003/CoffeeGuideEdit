package com.example.coffeeguide

import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    private var tabLayout: TabLayout? = null
    private var adapter: ViewPagerAdapter? = null
    private var viewPager: ViewPager? = null
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tabLayout = findViewById<View>(R.id.tabLayout) as TabLayout
        viewPager = findViewById<View>(R.id.viewpager) as ViewPager
        adapter = ViewPagerAdapter(supportFragmentManager)
        adapter!!.AddFragment(FragmentVarieties(), "Varieties")
        adapter!!.AddFragment(FragmentRatio(), " Brands")
        adapter!!.AddFragment(FragmentMakers(), "Makers")
        viewPager!!.adapter = adapter
        tabLayout!!.setupWithViewPager(viewPager)
        val actionBar = supportActionBar
        actionBar!!.elevation = 0f
    }
}