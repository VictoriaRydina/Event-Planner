package com.example.eventplanner

import android.app.Application
import android.content.Context
import androidx.fragment.app.Fragment
import com.example.eventplanner.di.component.AppComponent
import com.example.eventplanner.di.component.DaggerAppComponent

class App : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent
            .builder()
            .context(this)
            .build()
    }
}