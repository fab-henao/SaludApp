package com.fabianaht.saludapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fabianaht.saludapp.R
import com.fabianaht.saludapp.databinding.FragmentMenuBinding

class MenuFragment : Fragment(R.layout.fragment_menu) {

    private lateinit var binding: FragmentMenuBinding;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMenuBinding.bind(view);

        binding.cvgeneralmenu.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_generalFragment2);
        }

        binding.cwespecialidadesmenu.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_especialidadesFragment);
        }

        binding.cwodontologiamenu.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_odontologiaFragment);
        }

        binding.cwperdiatriamenu.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_dermatologiaFragment);
        }


    }
}