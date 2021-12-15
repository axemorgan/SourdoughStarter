import Dependencies.daggerHilt
import Dependencies.junit5
import Dependencies.junit5AndroidTests

plugins {
    id("com.android.application")
    id("dagger.hilt.android.plugin")
    id("de.mannodermaus.android-junit5")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = Configuration.compileSdk

    defaultConfig {
        // FIXME: change this to your desired package name
        applicationId = "dev.alexmorgan.changethis"

        minSdk = Configuration.minSdk
        targetSdk = Configuration.targetSdk
        versionCode = 1
        versionName = "0.1"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunnerArguments["runnerBuilder"] = "de.mannodermaus.junit5.AndroidJUnit5Builder"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(Kotlin.stdlib)

    implementation(AndroidX.appcompat)
    implementation(AndroidX.constraintLayout)
    implementation(AndroidX.coreKtx)

    daggerHilt()

    junit5()
    testImplementation(Dependencies.strikt)

    junit5AndroidTests()
    androidTestImplementation(AndroidX.testCore)
    androidTestImplementation(AndroidX.espressoCore)
}
