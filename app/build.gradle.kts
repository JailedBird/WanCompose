plugins {
    alias(libs.plugins.nowinandroid.android.application)
    alias(libs.plugins.nowinandroid.android.application.compose)
    alias(libs.plugins.nowinandroid.android.application.flavors)
    alias(libs.plugins.nowinandroid.android.hilt)
    alias(libs.plugins.nowinandroid.android.room)
}

android {
    namespace = "cn.jailedbird.app"

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(projects.core.resource)
    implementation(projects.core.common)
    implementation(projects.core.settings)
    implementation(projects.feature.search)
    implementation(projects.feature.settings)
    implementation(projects.feature.about)
    implementation(projects.feature.login)

    // // Hilt https://developer.android.com/training/dependency-injection/hilt-android

    // // https://square.github.io/leakcanary/getting_started/
    debugImplementation(libs.leakcanary)
    debugImplementation(libs.androidx.compose.ui.tooling)
    implementation(libs.androidx.compose.ui.tooling.preview)

    testImplementation(libs.junit4)
    androidTestImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.espresso.core)
}