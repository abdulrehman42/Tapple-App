package com.example.tapple

import VpAdapter
import android.annotation.SuppressLint
import android.graphics.PorterDuff
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import com.example.tapple.databinding.FragmentProBinding
import com.example.tapple.ui.Vadapterswipe
import com.google.android.material.tabs.TabLayout

class ProFragment : Fragment() {
    lateinit var binding:FragmentProBinding
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding=FragmentProBinding.inflate(layoutInflater)
        setUpTabLayout()
        return binding.root
    }

    private fun setUpTabLayout() {
        viewPager = binding.viewPager3
        tabLayout = binding.TabLayout3
        val vadapter = Vadapterswipe(childFragmentManager)
        vadapter.addFragment(FragmentLink(), "")
        vadapter.addFragment(vidFragment(), "")
        viewPager.adapter = vadapter
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.getTabAt(0)?.setIcon(R.drawable.link)
        tabLayout.getTabAt(1)?.setIcon(R.drawable.play)

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