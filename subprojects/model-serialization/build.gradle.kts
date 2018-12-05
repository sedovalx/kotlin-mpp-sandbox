configureMultiplatform {
    "commonMain" {
        dependencies {
            implementation(project(":subprojects:model"))
        }
    }
    "jvmMain" {
        dependencies {
            implementation(Deps.jackson_kotlin_module)
            implementation(Deps.kotlin_reflect)
        }
    }
}

configureKotlinJsTests()