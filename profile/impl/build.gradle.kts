plugins {
    id("com.johnbuhanan.androidlib")
}

// Declared in gradle/libs.versions.toml
dependencies {
    // ===== dagger =====
    kapt(libs.bundles.daggerKapt)
    implementation(libs.bundles.dagger)

    // Type-safe project accessors
    api(projects.profile.api)
    implementation(projects.data.api)
    implementation(projects.common)

    // ===== android =====
    implementation(libs.bundles.android)

    // ===== compose =====
    implementation(libs.bundles.compose)
    debugImplementation(libs.composeTooling)

    // ===== dagger =====
    implementation(libs.dagger)
    kapt(libs.daggerCompiler)

    // ===== tests =====
    testImplementation(libs.junit)
    androidTestImplementation(libs.bundles.androidTest)
    androidTestImplementation(libs.composeTest)
}
