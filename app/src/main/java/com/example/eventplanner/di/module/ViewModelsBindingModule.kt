package com.example.eventplanner.di.module

import androidx.lifecycle.ViewModel
import com.example.eventplanner.di.viewmodel.VMKey
import com.example.eventplanner.presentation.viewmodel.EventMainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelsBindingModule {

    @Binds
    @IntoMap
    @VMKey(EventMainViewModel::class)
    fun provideMainViewModel(mainViewModel: EventMainViewModel): ViewModel
}