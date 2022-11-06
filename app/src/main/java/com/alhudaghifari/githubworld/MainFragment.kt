package com.alhudaghifari.githubworld

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alhudaghifari.githubworld.databinding.FragmentMainBinding
import com.alhudaghifari.githubworld.databinding.PageDetailBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        activity?.let {
            val adapter = MainViewPagerAdapter(it.supportFragmentManager, lifecycle)
            binding.pager.adapter = adapter

            TabLayoutMediator(binding.tabLayout, binding.pager) { tab, position ->
                tab.text = resources.getStringArray(R.array.page_name)[position]
            }.attach()
        }

        return binding.root
    }
}