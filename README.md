# Sourdough Starter
A starter culture for Android Projects! :bread:

There are a lot of important things in Android development that the Android Studio project templates don't include. From dependency injection, to Kotlin build script for Gradle files, this project template seeks to provide those things and save time when creating a new project.

_Instead of cloning or forking this repo, use it as a [template](https://help.github.com/en/github/creating-cloning-and-archiving-repositories/creating-a-repository-from-a-template) instead._

### ViewBinding
* Pre-configured View Binding and a BaseFragment class to easily manage binding and unbinding the Fragment view

### Kotlin
* Kotlin and Java 8 source compatibility pre-configured
* Kotlin build scripts and `buildSrc` for dependency management

### AndroidX
* A selection of common AndroidX dependencies (recycler view, constraint layout, view model, ROOM, etc.) easily included

### Dagger Hilt
* Ready made `Application` subclass annotated with `@HiltAndroidApp`
* An example `Activity` and `Fragment` injected using Hilt

### Unit Testing
* Pre-configured for JUnit 5, with an example test
* Easily included support for running existing JUnit 4 test in the JUnit 5 runner

### GitHub Actions
* A workflow for building the app and running the unit tests on pull requests

### Misc
* A .gitignore file for Android projects
