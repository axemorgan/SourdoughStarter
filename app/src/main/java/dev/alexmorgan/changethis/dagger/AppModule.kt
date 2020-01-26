package dev.alexmorgan.changethis.dagger

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module
interface AppModule {
    @Binds
    fun bindProvidingViewModelFactory(factory: ProvidingViewModelFactory): ViewModelProvider.Factory
}