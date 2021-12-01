pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }

    plugins {
        id("com.android.tools.build.gradle") version "7.0.3"
        id("org.jetbrains.kotlin.kotlin-gradle-plugin") version "1.6.0"
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        google()
    }
}

rootProject.name = "Starter Application"
include(":app")