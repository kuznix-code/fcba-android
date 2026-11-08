plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.kuznix.candybar.adventure"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.kuznix.candybar.adventure"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    // Pure WebView app with no native libs: one universal APK that runs on every ABI
    // (arm64-v8a, armeabi-v7a, x86, x86_64). Make sure no per-ABI splits are produced.
    splits { abi { isEnable = false } }
    androidResources { noCompress += listOf("wasm", "swf") }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
    kotlinOptions { jvmTarget = "17" }
}
dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.webkit:webkit:1.11.0")
}
