plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation("com.android.tools.build:gradle:7.2.0-alpha07")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")
}
