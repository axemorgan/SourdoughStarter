buildscript {

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.0.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

task("clean") {
    delete(rootProject.buildDir)
}