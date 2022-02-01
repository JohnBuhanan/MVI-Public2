plugins {
    id("com.android.application")
    id("com.johnbuhanan.android")
}

android {
    defaultConfig {
        applicationId = "com.morfly.sample.archcompose"
    }
}

// Versions are declared in gradle/libs.versions.toml
dependencies {
    // ===== dagger =====
    kapt(libs.bundles.daggerKapt)
    implementation(libs.bundles.dagger)

    // Type-safe project accessors
    implementation(projects.images.impl)
    implementation(projects.profile.impl)
    implementation(projects.data.impl)
    implementation(projects.common)

    // ===== android =====
    implementation(libs.bundles.android)

    // ===== compose =====
    implementation(libs.bundles.compose)
    debugImplementation(libs.composeTooling)

    // ===== tests =====
    testImplementation(libs.junit)
    androidTestImplementation(libs.bundles.androidTest)
    androidTestImplementation(libs.composeTest)
}
