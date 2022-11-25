package com.example.eventplanner.di.viewmodel

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@Retention
@MapKey
annotation class VMKey(val value: KClass<out ViewModel>)