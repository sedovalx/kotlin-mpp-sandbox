plugins {
    java
    `kotlin-dsl`
}

dependencies {
    compile("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.10")
    compile("com.moowork.gradle:gradle-node-plugin:1.2.0")
}

repositories {
    jcenter()
    mavenCentral()
    maven { url = uri("https://plugins.gradle.org/m2/") }
}