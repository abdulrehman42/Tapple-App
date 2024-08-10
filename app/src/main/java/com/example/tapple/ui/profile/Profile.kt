package com.example.tapple.ui.profile

import VpAdapter
import android.graphics.PorterDuff
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.core.view.size
import androidx.viewpager.widget.ViewPager
import com.example.tapple.Corp
import com.example.tapple.ProFragment
import com.example.tapple.R
import com.example.tapple.SocailFragment
import com.example.tapple.databinding.FragmentProfileBinding
import com.example.tapple.ui.Vadapterswipe
import com.google.android.material.tabs.TabLayout



class Profile : Fragment() {
    lateinit var binding: FragmentProfileBinding
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        setUpTablayout()
        binding.close.setOnClickListener {
            close_it()
        }
        return binding.root

    }

    private fun close_it() {
        binding.cardView2.isVisible=false
    }

    private fun setUpTablayout() {
        viewPager = binding.viewPager
        tabLayout = binding.TabLayout
        val vadapter =
            Vadapterswipe(childFragmentManager) // Use childFragmentManager for fragments within a fragment
        vadapter.addFragment(SocailFragment(), "Social")
        vadapter.addFragment(ProFragment(), "Pro")
        vadapter.addFragment(Corp(), "Corp")
        viewPager.adapter = vadapter
        tabLayout.setupWithViewPager(viewPager)
        val tabSelectedListener = object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                val icon = tab.icon
                icon?.setColorFilter(
                    ContextCompat.getColor(requireContext(), R.color.dark_yellow),
                    PorterDuff.Mode.SRC_IN
                )
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                val icon = tab.icon
                icon?.setColorFilter(
                    ContextCompat.getColor(requireContext(), R.color.black),
                    PorterDuff.Mode.SRC_IN
                )
            }

            override fun onTabReselected(tab: TabLayout.Tab) {
                // Handle tab reselection if needed
            }
        }
        tabLayout.addOnTabSelectedListener(tabSelectedListener)

    }
}