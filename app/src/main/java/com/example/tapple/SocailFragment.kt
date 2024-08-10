package com.example.tapple

import VpAdapter
import android.graphics.PorterDuff
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import com.example.tapple.databinding.FragmentSocailBinding
import com.example.tapple.ui.Vadapterswipe
import com.google.android.material.tabs.TabLayout

class SocailFragment : Fragment() {
    private lateinit var binding: FragmentSocailBinding
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSocailBinding.inflate(inflater, container, false)
        setUpTabLayout()
        return binding.root
    }

    private fun setUpTabLayout() {
        viewPager = binding.viewPager2
        tabLayout = binding.TabLayout2
        val vadapter = Vadapterswipe(childFragmentManager)
        vadapter.addFragment(FragmentLink(), "\ngf")
        vadapter.addFragment(vidFragment(), "\ngg")
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