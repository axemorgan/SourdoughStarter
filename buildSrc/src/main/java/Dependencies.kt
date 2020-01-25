@file:Suppress("MemberVisibilityCanBePrivate")

import org.gradle.kotlin.dsl.DependencyHandlerScope

const val compileSdk = 29
const val minSdk = 23
const val targetSdk = 29

/**
 * org.jetbrains.kotlin dependencies
 */
object Kotlin {
    const val version = "1.3.61"

    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
}

/**
 * androidx dependencies
 */
object AndroidX {
    private object Versions {
        const val appcompat = "1.1.0"
        const val constraintLayout = "1.1.3"
    }

    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
}

object Dependencies {
    private object Versions {
        const val dagger = "2.25.4"
    }

    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger}"
    const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"

    /**
     * Configures all the required dependencies for Dagger Android
     */
    fun DependencyHandlerScope.daggerAndroid() {
        add("implementation", dagger)
        add("kapt", daggerCompiler)
        add("implementation", daggerAndroid)
        add("implementation", daggerAndroidSupport)
        add("kapt", daggerAndroidProcessor)
    }
}
