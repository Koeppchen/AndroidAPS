plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("android-module-dependencies")
    id("test-module-dependencies")
    id("jacoco-module-dependencies")
}

android {
    namespace = "app.aaps.shared.impl"
    defaultConfig {
        minSdk = Versions.wearMinSdk  // for wear
    }
}

dependencies {
    implementation(project(":core:data"))
    implementation(project(":core:interfaces"))

    //Logger
    api(Libs.Logging.slf4jApi)
    api(Libs.Logging.logbackAndroid)

    api(Libs.Rx.rxAndroid)
    api(Libs.jodaTimeAndroid)

    kapt(Libs.Dagger.compiler)
    kapt(Libs.Dagger.androidProcessor)
}