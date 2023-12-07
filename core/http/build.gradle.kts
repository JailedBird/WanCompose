plugins {
    alias(libs.plugins.nowinandroid.android.library)
    alias(libs.plugins.nowinandroid.android.hilt)
}

android {
    namespace = "cn.jailedbird.core.http"
}

dependencies {
    implementation("com.squareup.moshi:moshi-kotlin:1.14.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")

    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
    // PersistentCookieJar for OkHttp 3 https://github.com/franmontiel/PersistentCookieJar
    implementation("com.github.franmontiel:PersistentCookieJar:v1.0.1")


    implementation(projects.core.resource)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit4)
    androidTestImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.espresso.core)
}