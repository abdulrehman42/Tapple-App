package com.example.tapple.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tapple.databinding.FragmentMessageBinding

class NotificationsFragment : Fragment() {

    lateinit var binding:FragmentMessageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       

        binding = FragmentMessageBinding.inflate(layoutInflater)
        return binding.root
    }


}