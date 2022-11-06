package com.alhudaghifari.githubworld

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alhudaghifari.githubworld.databinding.PageDetailBinding

/**
 * Created by Farhan G. on 05/11/22.
 */
class DetailPage : Fragment() {

    private lateinit var binding: PageDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = PageDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

}