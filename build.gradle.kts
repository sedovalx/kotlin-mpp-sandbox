plugins {
    id("kotlin-multiplatform") apply false
    id("com.moowork.node") version "1.2.0" apply false
    id("com.dorongold.task-tree") version "1.3.1"
}

allprojects {
    group = "com.example"
    version = "0.0.1"
}

subprojects {
    // TODO: doesn't work along with the kotlin-multiplatform in Gradle 5
//    apply plugin: "maven-publish"
    
    repositories {
        mavenCentral()
    }
}


