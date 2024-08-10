package com.example.tapple

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tapple.databinding.FragmentCorpBinding


class Corp : Fragment() {
    lateinit var binding:FragmentCorpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding=FragmentCorpBinding.inflate(layoutInflater)
        return binding.root
    }


}