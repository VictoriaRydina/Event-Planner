package com.example.eventplanner.utils

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.eventplanner.App


fun Fragment.showToast(message: String) {
    Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show()
}

val Context.app: App get() = applicationContext as App
val Fragment.app: App get() = requireActivity().app

val Context.viewModelFactory get() = app.appComponent.viewModelFactory
val Fragment.viewModelFactory get() = app.appComponent.viewModelFactory