package dev.alexmorgan.changethis.dagger

import javax.inject.Scope

@Retention(AnnotationRetention.RUNTIME)
@Scope
annotation class ActivityScope

@Retention(AnnotationRetention.RUNTIME)
@Scope
annotation class FragmentScope