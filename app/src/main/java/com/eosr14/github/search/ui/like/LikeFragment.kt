package com.eosr14.github.search.ui.like

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.eosr14.github.search.R
import com.eosr14.github.search.databinding.FragmentLikeBinding

class LikeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return DataBindingUtil.inflate<FragmentLikeBinding>(layoutInflater, R.layout.fragment_like, container, false).apply {

        }.root
    }


}