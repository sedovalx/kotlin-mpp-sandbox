import com.moowork.gradle.node.task.NodeTask
import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import org.jetbrains.kotlin.gradle.plugin.KotlinTarget
import org.jetbrains.kotlin.gradle.plugin.KotlinTargetPreset
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinJsCompilation
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinJvmCompilation
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinJvmTargetPreset
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinOnlyTarget
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("kotlin-multiplatform")
}

kotlin {
    fromJvmPreset {
        compilations.all {
            compileKotlinTask(this).jvmVersion("1.8")
        }
    }
    fromJsPreset {
        compilations.all {
            compileKotlinTask(this).kotlinOptions {
                languageVersion = "1.3"
                moduleKind = "commonjs"
                sourceMap = true
                metaInfo = true
                main = "call"
            }
        }
    }
    configureSourceSets {
        "commonMain" {
            dependencies {
                implementation(Deps.kotlin_common)
            }
        }
        "commonTest" {
            dependencies {
                implementation(Deps.kotlin_test_common)
                implementation(Deps.kotlin_test_annotations_common)
            }
        }
        "jvmMain" {
            dependencies {
                implementation(Deps.kotlin_stdlib_jdk8)
            }
        }
        "jvmTest" {
            dependencies {
                implementation(Deps.kotlin_test)
                implementation(Deps.kotlin_test_junit)
            }
        }
        "jsMain" {
            dependencies {
                implementation(Deps.kotlin_stdlib_js)
            }
        }
        "jsTest" {
            dependencies {
                implementation(Deps.kotlin_test_js)
            }
        }
    }
}

configureKotlinJsTests()