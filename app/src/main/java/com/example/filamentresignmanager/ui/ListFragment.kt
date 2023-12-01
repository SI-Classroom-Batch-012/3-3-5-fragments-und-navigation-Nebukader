package com.example.filamentresignmanager.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import com.example.filamentresignmanager.MainActivity
import com.example.filamentresignmanager.R
import com.example.filamentresignmanager.databinding.FragmentListBinding
import com.example.filamentresignmanager.ui.adapter.ItemAdapter


class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = view.findNavController()

        val maninActivity = activity as MainActivity
        val dataset = maninActivity.resins

        val adapter = ItemAdapter(dataset)
        binding.recyclerView.adapter = adapter

    }
}