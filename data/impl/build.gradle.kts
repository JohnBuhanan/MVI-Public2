plugins {
    id("com.johnbuhanan.androidlib")
}

// Versions are declared in gradle/libs.versions.toml
dependencies {
    kapt(libs.bundles.daggerKapt)
    implementation(libs.bundles.dagger)
    // Type-safe project accessors
    api(projects.data.api)
    implementation(projects.common)

    // ===== android =====
    implementation(libs.bundles.android)
    implementation(libs.paging)

    // ===== retrofit =====
    implementation(libs.bundles.retrofit)

    // ===== room =====
    implementation(libs.bundles.room)
    kapt(libs.roomCompiler)

    // ===== tests =====
    testImplementation(libs.junit)
    androidTestImplementation(libs.bundles.androidTest)
}
