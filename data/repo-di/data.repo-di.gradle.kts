plugins {
    id("com.android.library")
    id("kotlin-android")
}

apply {
    from("${rootProject.projectDir}/android.gradle")
    from("${rootProject.projectDir}/lint.gradle")
}

dependencies {
    implementation(project(":data:repo"))
    implementation(project(":data:repo-impl"))
    implementation(project(":data:service"))

    implementation(Dependencies.Koin.core)
}