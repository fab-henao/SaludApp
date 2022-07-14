package com.fabianaht.saludapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fabianaht.saludapp.R
import com.fabianaht.saludapp.databinding.FragmentForgotBinding


class ForgotFragment : Fragment(R.layout.fragment_forgot) {

    private lateinit var binding: FragmentForgotBinding;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forgot, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentForgotBinding.bind(view);

        binding.tvsinguplink.setOnClickListener{

            findNavController().navigate(R.id.action_forgotFragment_to_singUpFragment)

        }

        binding.tvsingtxt.setOnClickListener{

            findNavController().navigate(R.id.action_forgotFragment_to_singUpFragment)

        }

    }

}