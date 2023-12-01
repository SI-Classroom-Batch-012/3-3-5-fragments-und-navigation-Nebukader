package com.example.filamentresignmanager.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.filamentresignmanager.MainActivity
import com.example.filamentresignmanager.R
import com.example.filamentresignmanager.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {



    val args:DetailFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var binding: FragmentDetailBinding = FragmentDetailBinding.bind(view)
        val postion =args.position
        val mainActivity = activity as MainActivity
        val data = mainActivity.resins[postion]

        binding.ResinManufcaterTV.text = data.name
        binding.resinPriceTV.text = data.price
        binding.typeResinTV.text = data.type
        binding.resinColourTV.text = data.color
        binding.exposureTimeResinTV.text = data.exposureTime
        binding.firstLayerExposureResinTV.text = data.firstLayerTime
        binding.resinDetailIV.setImageResource(data.image)

    }
}