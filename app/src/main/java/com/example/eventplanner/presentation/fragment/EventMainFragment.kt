package com.example.eventplanner.presentation.fragment

import android.os.Bundle
import android.view.View
import com.example.eventplanner.core.fragment.BaseFragment
import com.example.eventplanner.R
import com.example.eventplanner.core.adapter.BaseViewPagerAdapter
import com.example.eventplanner.databinding.FragmentEventMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class EventMainFragment : BaseFragment<FragmentEventMainBinding>(
    R.layout.fragment_event_main,
    FragmentEventMainBinding::inflate
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            addEvent.setOnClickListener {
                navigateTo(R.id.newEventFragment)
            }
        }
        initModelDescriptionPager()
    }

    private fun initModelDescriptionPager() {
        val items = listOf(
            EventsFragment(),
            VisitedFragment(),
            MissedFragment()
        )
        val adapter = BaseViewPagerAdapter(childFragmentManager, lifecycle, items)
        with(binding) {
            eventMainPager.adapter = adapter
            TabLayoutMediator(tabLayout, eventMainPager) { tab, position ->
                when (position) {
                    EVENTS_FRAGMENT -> tab.text = getString(R.string.events)
                    VISITED_FRAGMENT -> tab.text = getString(R.string.visited)
                    MISSED_FRAGMENT -> tab.text = getString(R.string.missed)
                }
            }.attach()
        }
    }

    companion object {
        private const val EVENTS_FRAGMENT = 0
        private const val VISITED_FRAGMENT = 1
        private const val MISSED_FRAGMENT = 2
    }
}