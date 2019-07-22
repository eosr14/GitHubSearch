package com.eosr14.github.search.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.eosr14.github.search.ui.like.LikeFragment
import com.eosr14.github.search.ui.search.SearchFragment

class MainPagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> SearchFragment()
            1 -> LikeFragment()
            else -> Fragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0-> "검색"
            1-> "좋아요"
            else -> ""
        }
    }

}