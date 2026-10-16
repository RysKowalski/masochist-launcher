plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.emptyapp"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.emptyapp"
        minSdk = 23
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        buildConfig = false
    }
}
