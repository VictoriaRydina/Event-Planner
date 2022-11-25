package com.example.eventplanner.di.module

import dagger.Module

@Module(
    includes = [
        DispatchersModule::class,
        UtilsModule::class
    ]
)
abstract class AppModule