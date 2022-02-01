plugins {
    id("com.johnbuhanan.androidlib")
}

// Versions are declared in gradle/libs.versions.toml
dependencies {
    // ===== dagger =====
    kapt(libs.bundles.daggerKapt)
    implementation(libs.bundles.dagger)

    // Type-safe project accessors
    implementation(projects.common)

    // ===== android =====
    implementation(libs.bundles.android)

    // ===== compose =====
    implementation(libs.bundles.compose)
    debugImplementation(libs.composeTooling)

    // ===== tests =====
//    testImplementation(libs.junit)
//    androidTestImplementation(libs.bundles.androidTest)
//    androidTestImplementation(libs.composeTest)
}
