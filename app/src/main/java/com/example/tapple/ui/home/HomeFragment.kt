package com.example.tapple.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tapple.databinding.FragmentEventBinding

class HomeFragment : Fragment() {
    lateinit var binding:FragmentEventBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentEventBinding.inflate(layoutInflater)
        
        return binding.root
    }

  
}