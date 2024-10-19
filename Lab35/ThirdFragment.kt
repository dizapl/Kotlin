package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentSecondBinding
import com.example.myapplication.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    private lateinit var binding3: FragmentThirdBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding3= FragmentThirdBinding.inflate(layoutInflater, container, false)
        return binding3.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding3.button3.setOnClickListener {

            findNavController().navigateUp()
        }
        binding3.btnToThird.setOnClickListener {

            findNavController().navigate(ThirdFragmentDirections.toFirstFragment())
        }
    }
}