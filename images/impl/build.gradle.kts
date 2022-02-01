plugins {
    id("com.johnbuhanan.androidlib")
}

// Versions are declared in gradle/libs.versions.toml
dependencies {
    // ===== dagger =====
    kapt(libs.bundles.daggerKapt)
    implementation(libs.bundles.dagger)

    // Type-safe project accessors
    api(projects.images.api)
    implementation(projects.profile.api)
    implementation(projects.data.api)
    implementation(projects.common)

    // ===== android =====
    implementation(libs.bundles.android)
    implementation(libs.paging)

    // ===== compose =====
    implementation(libs.bundles.compose)
    implementation(libs.composePaging)
    debugImplementation(libs.composeTooling)

    // ===== tests =====
    testImplementation(libs.junit)
    androidTestImplementation(libs.bundles.androidTest)
    androidTestImplementation(libs.composeTest)
}
