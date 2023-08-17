plugins {
    id("com.android.library")
    id("kotlin-android")
    id("org.jetbrains.kotlin.plugin.parcelize")
    id("androidx.navigation.safeargs.kotlin")
}

apply {
    from("${rootProject.projectDir}/android.gradle")
    from("${rootProject.projectDir}/lint.gradle")
}

android {
    buildFeatures {
        viewBinding = true
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }
}

dependencies {
    implementation(project(":presentation-entity"))
    implementation(project(":interactor"))
    implementation(project(":resources"))
    implementation(project(":navigation"))

    implementation(Dependencies.Kotlin.stdLib)

    implementation(Dependencies.Koin.core)
    implementation(Dependencies.Koin.android)
    implementation(Dependencies.Koin.navigation)
    implementation(Dependencies.Koin.compose)

    implementation(Dependencies.Material.material)

    implementation(Dependencies.Compose.activity)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.animation)
    implementation(Dependencies.Compose.uiTooling)
    implementation(Dependencies.Compose.viewModel)
    implementation(Dependencies.Compose.materialIconCore)
    implementation(Dependencies.Compose.materialIconExtended)
    implementation(Dependencies.Compose.foundation)
    implementation(Dependencies.Compose.liveData)

    implementation(Dependencies.Image.coil)

    implementation(Dependencies.Logging.timber)
    implementation(Dependencies.Coroutines.core)
    implementation(Dependencies.Coroutines.android)
    implementation(Dependencies.Android.appCompat)
    implementation(Dependencies.Android.coreKtx)
    implementation(Dependencies.Android.fragment)
    implementation(Dependencies.Android.constraintLayout)
    implementation(Dependencies.Android.recyclerView)
    implementation(Dependencies.Android.lifecycleLiveDataCore)
    implementation(Dependencies.Android.lifecycleLiveDataKtx)
    implementation(Dependencies.Android.lifecycleViewModel)
    implementation(Dependencies.Android.lifecycleViewModelKtx)
    implementation(Dependencies.Android.navigationFragment)
    implementation(Dependencies.Android.navigationUi)
    implementation(Dependencies.Android.splashScreen)

    testImplementation(Dependencies.Test.androidxArchCore)
    testImplementation(Dependencies.Test.coroutines)
    testImplementation(Dependencies.Test.kotlinTest)
    testImplementation(Dependencies.Test.flowTest)
    testImplementation(Dependencies.Test.mockito)
    implementation(Dependencies.Test.javaClientAppium)
    implementation("org.testng:testng:6.14.3")
    implementation("commons-validator:commons-validator:1.7")
    implementation("commons-lang:commons-lang:2.6")
    implementation("com.google.guava:guava:30.1.1-jre")
    implementation("org.slf4j:slf4j-reload4j:2.0.5")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("commons-io:commons-io:2.11.0")

    androidTestImplementation(Dependencies.Compose.uiTest)
}