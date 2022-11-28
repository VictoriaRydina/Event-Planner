package com.example.eventplanner.presentation.fragment

import android.os.Bundle
import android.view.View
import com.example.eventplanner.core.fragment.BaseFragment
import com.example.eventplanner.R
import com.example.eventplanner.databinding.FragmentNewEventBinding
import com.example.eventplanner.utils.showToast

class NewEventFragment : BaseFragment<FragmentNewEventBinding>(
    R.layout.fragment_new_event,
    FragmentNewEventBinding::inflate
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            addNewEvent.setOnClickListener {
                if (enterEventName.text.isNullOrEmpty() || enterEventDate.text.isNullOrEmpty()) {
                    showToast("Enter name and date")
                } else {
                    showToast("Create event")
                    navigateTo(R.id.mainFragment)
                }
            }
            closeNewEvent.setOnClickListener {
                showToast("Close new event")
                navigateTo(R.id.mainFragment)
            }
        }
    }
}