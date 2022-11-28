package com.example.eventplanner.di.component

import android.content.Context
import com.example.eventplanner.di.viewmodel.ViewModelFactory
import com.example.eventplanner.di.module.*
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        DataModule::class,
        NetworkModule::class,
        DomainModule::class,
        ViewModelsBindingModule::class
    ]
)
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }

    val viewModelFactory: ViewModelFactory
}