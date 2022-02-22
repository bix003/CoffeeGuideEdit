package com.example.coffeeguide

import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import java.util.ArrayList

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val lstFragment: MutableList<Fragment> = ArrayList()
    private val lstTitles: MutableList<String> = ArrayList()
    override fun getItem(position: Int): Fragment {
        return lstFragment[position]
    }

    override fun getCount(): Int {
        return lstTitles.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return lstTitles[position]
    }

    fun AddFragment(fragment: Fragment, title: String) {
        lstFragment.add(fragment)
        lstTitles.add(title)
    }
}