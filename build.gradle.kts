plugins {
    id("com.dorongold.task-tree") version "1.3.1"
    id("net.rdrei.android.buildtimetracker") version "0.11.0"
}

allprojects {
    group = "com.example"
    version = "0.0.1"
}

subprojects {
    /**
     * TODO: doesn't work along with the kotlin-multiplatform in Gradle 5
     * See: https://youtrack.jetbrains.com/issue/KT-28520
     */
//    apply(plugin = "maven-publish")
    
    repositories {
        mavenCentral()
    }
}

buildtimetracker {
    reporters {
        register("summary") {
            options["ordered"] = "true"
            options["barstyle"] = "ascii"
            options["shortenTaskNames"] = "false"
        }
    }
}

