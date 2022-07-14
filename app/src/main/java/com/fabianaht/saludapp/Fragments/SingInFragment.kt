package com.fabianaht.saludapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fabianaht.saludapp.R
import com.fabianaht.saludapp.databinding.FragmentSingInBinding

class SingInFragment : Fragment(R.layout.fragment_sing_in) {

    private lateinit var binding: FragmentSingInBinding;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sing_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSingInBinding.bind(view);

        binding.btnsingup.setOnClickListener{
            findNavController().navigate(R.id.action_singInFragment_to_singUpFragment);
        }

        binding.tvforgotpassword.setOnClickListener{
            findNavController().navigate(R.id.action_singInFragment_to_forgotFragment);
        }

        binding.btnsingin.setOnClickListener{
            findNavController().navigate(R.id.action_singInFragment_to_menuFragment);
        }

    }
}