apply(plugin = "com.github.ben-manes.versions")

buildscript {
    repositories {
        google()
        gradlePluginPortal()
        jcenter()
        maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://maven.fabric.io/public") }
    }

    dependencies {
        classpath(GradlePlugin.android)
        classpath(GradlePlugin.versions)
        classpath(GradlePlugin.kotlin)
    }
}

allprojects {
    repositories {
        google()
        gradlePluginPortal()
        jcenter()
        maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://maven.fabric.io/public") }
    }
}