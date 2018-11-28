plugins {
    id("com.dorongold.task-tree") version "1.3.1"
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


