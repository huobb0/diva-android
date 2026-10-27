plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "eu.defdev.diva"
    compileSdk = 37

    defaultConfig {
        applicationId = "eu.defdev.diva"
        minSdk = 27
        targetSdk = 37
        versionCode = 1
        versionName = "1.0293"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
}
