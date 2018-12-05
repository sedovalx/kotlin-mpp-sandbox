# kotlin-mpp-sandbox
Kotlin multiplatform + JS Mocha tests + Gradle 5 + Kotlin DSL

It's an attempt to setup a multiplatform (JVM/JS) Kotlin project with working tests. Build scrips are 
written with Kotlin DSL version which comes with Gradle 5. It's a hacky way to write build scripts for
the moment because Gradle Kotlin DSL is not officially supported for the current release (1.3.10) of
the MPP plugin. With the next versions of the MPP plugin there will be no need in writing
custom DSLs over it (see `buildSrc/src/main/kotlin/KotlinDSL.kt`). 

What doesn't work:
- Gradle test runner in the IntelliJ IDEA 2018.3 doesn't recognize executing Mocha tests when you run 
the `test` Gradle task via Gradle tool panel.
- There are different class version problems when building with Kotlin DSL versions lower than 1.0.4
which comes with Gradle 5.0. The reason for this is that `kotlin-multiplatform:1.3.10` plugin is in the
classpath of the buildSrc. It's the main reason why this project is build with Gradle 5.0 as I want it
to be pure Kotlin DSL build.
- Maven publish plugin [can't be applied](https://youtrack.jetbrains.com/issue/KT-28520) along with the MPP plugin in a Gradle 5.0 build as the MPP 
plugin uses deprecated publication features that have been removed in Gradle 5.0.

TODO:
- [x] Sample of dependencies between MPP modules
- [x] Sample of a JS module with tests with a usage of an external JS dependency via ts2kt (Definitely typed)
- [ ] JS dist build with weppack
- [ ] Publication of a Maven artifact with JVM classes
- [ ] Publication of an NPM module with JS dist

## How to add a new external JS dependency?
- Add a dependency into the root `project.json`'s dependencies section
- Run `npm install` to download the dependency
- Check if the dependency folder in `node_modules` contains definitely-typed declarations (*.d.ts). If not 
you may try to find it on https://github.com/DefinitelyTyped/DefinitelyTyped repo
- Install the converter to convert definitely-typed declarations into Kotlin code `npm install -g ts2kt`
- Run the converter
```bash
ts2kt -d subprojects/model/src/jsMain/kotlin/external/moment node_modules/moment/moment.d.ts
```
- Inspect the generated code. Unfortunately sometimes it needs to be fixed by hands.
- You need to require the external JS module in your generated JS code. For that purpose, add 
`@JsModule("moment)` and optionally `@JsNonModule` annotations to the generated constructions that 
you use in your code

## How to run tests?
Just run `./gradlew clean test --continue` in the terminal to run all the tests (JVM, common, JS) in 
the project. For now, the `--continue` parameter is required, otherwise the build stops in case 
there are failed tests during the `runTestsWithMocha` task execution. The best option would be to 
have a setting for the `runTestsWithMocha` to continue the build but fail it in the end - the same as
with the `--continue` option but local.

If you start tests by running a Gradle task from the IDEA's Gradle tool panel then only JVM and common
tests are shown in the Gradle Test Runner window. 