package dev.alexmorgan.changethis.main_activity

import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dev.alexmorgan.changethis.dagger.ActivityScope
import dev.alexmorgan.changethis.dagger.FragmentScope

@Module
interface MainActivityFeatureModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    fun contributeMainActivity(): MainActivity
}

@Module
interface MainFragmentModule {
    @FragmentScope
    @ContributesAndroidInjector
    fun contributeMainFragment(): MainFragment

    companion object {
        @Provides
        fun provideString(): String = "Hello World!"
    }
}