plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(compileSdk)

    defaultConfig {
        // FIXME: change this to your desired package name
        applicationId = "dev.alexmorgan.changethis"

        minSdkVersion(minSdk)
        targetSdkVersion(targetSdk)
        versionCode = 1
        versionName = "0.1"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(Kotlin.stdlib)
//    implementation('androidx.appcompat:appcompat:1.0.2')
//    implementation('androidx.core:core-ktx:1.0.2')
//
//    testImplementation('junit:junit:4.12')
//
//    androidTestImplementation('androidx.test.ext:junit:1.1.0')
//    androidTestImplementation('androidx.test.espresso:espresso-core:3.1.1')
}
