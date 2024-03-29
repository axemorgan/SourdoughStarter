# Sourdough Starter
A starter culture for Android Projects! :bread:

There are a lot of important things in Android development that the Android Studio project templates don't include. From dependency injection, to JUnit 5 for testing, to Kotlin build scripts for Gradle files, this project template seeks to provide those things and save time when creating a new project.

_Instead of cloning or forking this repo, use it as a [template](https://help.github.com/en/github/creating-cloning-and-archiving-repositories/creating-a-repository-from-a-template) instead._

## Included Things

### View Binding
* Pre-enabled view binding and a `ViewBoundFragment` base class to easily manage binding and unbinding `Fragment` views

### Kotlin
* Kotlin and Java 8 source compatibility pre-configured
* Kotlin build scripts and `buildSrc` for dependency management

### AndroidX
* A selection of common AndroidX dependencies (recycler view, constraint layout, view model, Room, etc.) easily included

### Dagger Hilt
* Ready made `Application` subclass annotated with `@HiltAndroidApp`
* An example `Activity` and `Fragment` injected using Hilt

### Testing
* Pre-configured for running unit tests under JUnit 5, with an example test
* Easily included support for running existing JUnit 4 unit tests in the JUnit 5 runner
* Pre-configured support for running instrumentation tests under JUnit 5 as well
* Espresso and Androidx testing dependencies included, with an example test

### GitHub Actions
* A workflow for building the app, running the unit tests, and running the instrumentation test on pull requests

### Misc
* A .gitignore file for Android projects
