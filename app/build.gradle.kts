plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(34)

    defaultConfig {
        applicationId = "com.example.cinescopeapp"
        minSdkVersion(24)
        targetSdkVersion(34)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), file("proguard-rules.pro"))
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.gms:play-services-auth:20.4.0")
    implementation("androidx.core:core-ktx:1.7.0") // Adjusted version
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation(libs.androidx.navigation.runtime.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
}
