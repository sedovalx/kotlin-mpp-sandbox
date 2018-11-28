import com.moowork.gradle.node.NodeExtension
import com.moowork.gradle.node.task.NodeTask
import org.gradle.api.Project
import org.gradle.api.tasks.compile.AbstractCompile
import org.gradle.kotlin.dsl.*
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

fun Project.configureKotlinJsTests() {
    apply(plugin = "com.moowork.node")

    configure<NodeExtension> {
        yarnVersion = "1.12.3"
        workDir = file("${rootProject.buildDir}/nodejs")
        nodeModulesDir = file("${rootProject.projectDir}")
    }

    tasks {
        val yarn by getting
        val compileKotlinJs by getting(AbstractCompile::class)
        val compileTestKotlinJs by getting(Kotlin2JsCompile::class)
        val jsTest by getting

        val populateNodeModulesForTests by creating {
            dependsOn(yarn, compileKotlinJs)
            doLast {
                copy {
                    from(compileKotlinJs.destinationDir)
                    configurations["jsRuntimeClasspath"].forEach {
                        from(zipTree(it.absolutePath).matching { include("*.js") })
                    }
                    configurations["jsTestRuntimeClasspath"].forEach {
                        from(zipTree(it.absolutePath).matching { include("*.js") })
                    }

                    into("$rootDir/node_modules")
                }
            }
        }

        val runTestsWithMocha by creating(NodeTask::class) {
            dependsOn(populateNodeModulesForTests)
            setScript(file("$rootDir/node_modules/mocha/bin/mocha"))
            setArgs(listOf(
                compileTestKotlinJs.outputFile,
                "--reporter-options",
                "topLevelSuite=${project.name}-tests"
            ))
        }

        jsTest.dependsOn(runTestsWithMocha)
    }
}