package com.example.eventplanner.presentation.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.example.eventplanner.NewEventModel
import com.example.eventplanner.core.fragment.BaseFragment
import com.example.eventplanner.R
import com.example.eventplanner.databinding.FragmentEventsBinding
import com.example.eventplanner.presentation.adapter.OneItemEventAdapter

class EventsFragment : BaseFragment<FragmentEventsBinding>(
    R.layout.fragment_events,
    FragmentEventsBinding::inflate
) {

    private var oneItemEventAdapter = setUpOneItemEventAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
    }

    private fun initRecycler() {
        val event = NewEventModel(
            1, "Встреча", "123",
            "Smolensk", "Weather", "20.0"
        )
        val eventTwo = NewEventModel(
            1, "Рабочая встреча", "123",
            "Нижний Новгород", "Weather", "10.0"
        )
        val subList = listOf(event, eventTwo)

        with(binding) {
            eventsRecycler.layoutManager =
                GridLayoutManager(context, 2)
            eventsRecycler.adapter = oneItemEventAdapter
            oneItemEventAdapter.submitList(subList)
        }
    }

    private fun setUpOneItemEventAdapter(): OneItemEventAdapter {
        return OneItemEventAdapter {
            navigateTo(R.id.detailsEventFragment)
        }
    }
}