plugins {
    id("com.android.library")
    id(Plugins.ANDROID)
    id(Plugins.COMPOSE)
}

android {
    namespace = "com.wednesday.template.feature.core"
}

dependencies {
    implementation(project(":ui:presentation-entity"))
    implementation(project(":data:domain-entity"))
    implementation(project(":data:core"))

    implementation(Dependencies.Koin.core)

    implementation(Dependencies.Logging.timber)

    implementation("androidx.core:core-ktx:1.8.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    
}