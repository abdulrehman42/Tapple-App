package com.example.tapple.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tapple.databinding.FragmentMoreBinding


class More : Fragment() {
  lateinit var binding: FragmentMoreBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentMoreBinding.inflate(layoutInflater)
        return binding.root
    }

    }