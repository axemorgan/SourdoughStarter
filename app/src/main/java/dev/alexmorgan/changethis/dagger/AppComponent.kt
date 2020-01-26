package dev.alexmorgan.changethis.dagger

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import dev.alexmorgan.changethis.Application
import dev.alexmorgan.changethis.main_activity.MainActivityFeatureModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, AndroidSupportInjectionModule::class, MainActivityFeatureModule::class])
interface AppComponent {
    fun inject(application: Application)
}