buildscript {

    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.0.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

task("clean") {
    delete(rootProject.buildDir)
}