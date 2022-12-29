import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

apply {
    from(rootProject.file("detekt/detekt.gradle"))
    from(rootProject.file("ktlint/ktlint.gradle"))
    from(rootProject.file("lint/lint.gradle"))
}

android {
    compileSdkVersion(Config.compileSdkVersion)

    defaultConfig {
        applicationId = Config.applicationId

        minSdkVersion(Config.minSdkVersion)
        targetSdkVersion(Config.targetSdkVersion)

        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    sourceSets {
        getByName("main").java.srcDirs("src/main/kotlin")
        getByName("test").java.srcDirs("src/test/kotlin")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

tasks.withType<Test> {
    useJUnitPlatform()

    testLogging {
        events(
            TestLogEvent.PASSED,
            TestLogEvent.SKIPPED,
            TestLogEvent.FAILED,
            TestLogEvent.STANDARD_ERROR,
            TestLogEvent.STANDARD_OUT
        )
        exceptionFormat = TestExceptionFormat.FULL
    }
}

dependencies {
    implementation(AndroidSupport.annotations)
    implementation(AndroidSupport.appCompat)
    implementation(AndroidSupport.cardView)
    implementation(AndroidSupport.design)
    implementation(AndroidSupport.recyclerView)
    implementation(AndroidSupport.v4)

    implementation(AndroidX.coreKtx)
    implementation(AndroidX.fragmentKtx)

    kapt(Dagger.compiler)
    implementation(Dagger.runtime)

    testImplementation(JUnit.api)
    testRuntimeOnly(JUnit.engine)
    testImplementation(JUnit.params)
    testRuntimeOnly(JUnit.vintageEngine)

    implementation(Kotlin.stdLib)

    implementation(OkHttp.it)
    implementation(OkHttp.logging)

    implementation(Retrofit.adapterRxJava)
    implementation(Retrofit.converterGson)
    implementation(Retrofit.it)

    implementation(RxJava.it)
    implementation(RxJava.rxAndroid)
    implementation(RxJava.rxRelay)

    testImplementation(Unclassified.assertJ)
    implementation(Unclassified.gson)
    testImplementation(Unclassified.mockk)
    implementation(Unclassified.rxLint)
    implementation(Unclassified.timber)
}