package dev.alexmorgan.changethis.main_activity

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
object HelloWorldModule {
    @Provides
    fun provideString(): String = "Hello World!"
}