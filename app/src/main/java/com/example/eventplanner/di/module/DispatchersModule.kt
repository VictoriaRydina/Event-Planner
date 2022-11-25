package com.example.eventplanner.di.module

import com.example.eventplanner.di.annotation.DispatcherIO
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers

@Module
class DispatchersModule {

    @Provides
    @DispatcherIO
    fun provideDispatcherIO() = Dispatchers.IO
}