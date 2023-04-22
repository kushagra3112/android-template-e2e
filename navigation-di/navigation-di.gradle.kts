plugins {
    id("com.android.library")
    id(Plugins.ANDROID)
    id(Plugins.COMPOSE)
}

dependencies {
    implementation(project(":navigation"))
    implementation(project(":navigation-impl"))

    implementation(Dependencies.Kotlin.stdLib)

    implementation(Dependencies.Koin.core)

    implementation(Dependencies.Android.appCompat)

}