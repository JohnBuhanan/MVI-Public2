@file:Suppress("DEPRECATION")

import com.android.build.gradle.BaseExtension

plugins {
    kotlin("android")
}
apply(plugin = "kotlin-kapt")
apply(plugin = "dagger.hilt.android.plugin")

with(the<BaseExtension>()) {
    compileSdkVersion(31)
    buildToolsVersion = "30.0.3"
    defaultConfig {
        minSdk = 24
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    packagingOptions {
        excludes += "META-INF/AL2.0"
        excludes += "META-INF/LGPL2.1"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures.compose = true

    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.0-rc03"
    }
}

dependencies {
//    "kapt"(libs.resolveDependency("bundles.daggerKapt"))
//    "implementation"(libs.resolveDependency("hiltAndroid"))
//    "implementation"(libs.resolveDependency("bundles.dagger"))
}
