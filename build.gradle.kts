// Android and Kotlin Gradle plugins are declared in buildSrc/build.gradle.kts

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(libs.agp)
        classpath(libs.kotlinGradlePlugin)
        classpath(libs.hiltAndroidGradlePlugin)
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
