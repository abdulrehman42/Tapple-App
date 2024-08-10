package com.example.tapple.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tapple.R
import com.example.tapple.databinding.FragmentUpcomingBinding

class Upcoming : Fragment() {
    lateinit var binding:FragmentUpcomingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentUpcomingBinding.inflate(layoutInflater)
        return binding.root
    }


}