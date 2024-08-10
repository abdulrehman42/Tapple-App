package com.example.tapple.ui.event

import android.graphics.PorterDuff
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import com.example.tapple.Corp
import com.example.tapple.ProFragment
import com.example.tapple.R
import com.example.tapple.SocailFragment
import com.example.tapple.databinding.ActivityMainBinding
import com.example.tapple.databinding.FragmentEventBinding
import com.example.tapple.ui.Booked
import com.example.tapple.ui.MyEvent
import com.example.tapple.ui.Upcoming
import com.example.tapple.ui.Vadapterswipe
import com.google.android.material.tabs.TabLayout


class Event : Fragment() {
    lateinit var binding: FragmentEventBinding
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentEventBinding.inflate(layoutInflater)
        setUpTablayout()
        return binding.root
    }
    private fun setUpTablayout() {
        viewPager = binding.viewPagerEvent
        tabLayout = binding.TabLayoutEvent
        val vadapter =
            Vadapterswipe(childFragmentManager) // Use childFragmentManager for fragments within a fragment
        vadapter.addFragment(Upcoming(), "Upcoming")
        vadapter.addFragment(Booked(), "Booked")
        vadapter.addFragment(MyEvent(), "My Event")
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