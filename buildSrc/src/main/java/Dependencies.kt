@file:Suppress("MemberVisibilityCanBePrivate", "unused")

import org.gradle.kotlin.dsl.DependencyHandlerScope

object Configuration {
    const val compileSdk = 31
    const val minSdk = 23
    const val targetSdk = 31
}

/**
 * org.jetbrains.kotlin dependencies
 */
object Kotlin {
    const val version = "1.6.0"

    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
}

/**
 * androidx dependencies
 */
object AndroidX {
    private object Versions {
        const val appcompat = "1.1.0"
        const val biometric = "1.0.1"
        const val browser = "1.2.0"
        const val cardView = "1.0.0"
        const val constraintLayout = "2.0.0"
        const val coordinatorLayout = "1.1.0"
        const val core = "1.3.1"
        const val lifecycle = "2.2.0"
        const val recyclerView = "1.1.0"
        const val room = "2.2.5"
    }

    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val biometric = "androidx.biometric:biometric:${Versions.biometric}"
    const val browser = "androidx.browser:browser:${Versions.browser}"
    const val cardView = "androidx.cardview:cardview:${Versions.cardView}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.core}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val coordinatorLayout = "androidx.coordinatorlayout:coordinatorlayout:${Versions.coordinatorLayout}"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$${Versions.lifecycle}"

    /**
     * Configures all the required dependencies for Room
     */
    fun DependencyHandlerScope.room() {
        add("implementation", roomRuntime)
        add("implementation", roomKtx)
        add("kapt", roomCompiler)
    }
}

object Dependencies {
    private object Versions {
        const val dagger = "2.40.3"
        const val junit = "5.8.0"
        const val junitLegacy = "4.13.2"
        const val strikt = "0.33.0"
    }

    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val hiltPlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.dagger}"
    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.dagger}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.dagger}"

    /**
     * Includes all dependency configuration required to use Dagger Hilt
     */
    fun DependencyHandlerScope.daggerHilt() {
        add("implementation", hiltAndroid)
        add("kapt", hiltCompiler)
    }

    const val jupiterApi = "org.junit.jupiter:junit-jupiter-api:${Versions.junit}"
    const val jupiterEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit}"
    const val jupiterParameterized = "org.junit.jupiter:junit-jupiter-params:${Versions.junit}"

    const val junitVintageEngine = "org.junit.jupiter:junit-vintage-engine:${Versions.junit}"
    const val junit4 = "junit:junit:${Versions.junitLegacy}"

    /**
     * Includes all dependency configuration required to use JUnit 5 tests. (Without legacy support for JUnit 4)
     */
    fun DependencyHandlerScope.junit5() {
        add("testImplementation", jupiterApi)
        add("testRuntimeOnly", jupiterEngine)
        add("testImplementation", jupiterParameterized)
    }

    /**
     * Includes all dependency configuration required to use JUnit 5 tests, and includes junit 4 and the
     * vintage engine, allowing you to run legacy tests in JUnit 5.
     */
    fun DependencyHandlerScope.junit5WithLegacySupport() {
        junit5()
        add("testImplementation", junit4)
        add("testRuntimeOnly", junitVintageEngine)
    }

    const val strikt = "io.strikt:strikt-core:${Versions.strikt}"
}
