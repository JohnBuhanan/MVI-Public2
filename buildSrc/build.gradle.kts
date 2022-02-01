plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
    google()
}

dependencies {
    implementation(libs.hiltAndroidGradlePlugin)
    implementation(libs.agp)
    implementation(libs.kotlinGradlePlugin)
    implementation(gradleApi())
    implementation(localGroovy())

    testImplementation(libs.assertk)
//    testImplementation(libs.junit4)
}
