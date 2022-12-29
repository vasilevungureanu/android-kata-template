object AndroidSupport {
    private const val version = "28.0.0"

    const val annotations = "com.android.support:support-annotations:$version"
    const val appCompat = "com.android.support:appcompat-v7:$version"
    const val cardView = "com.android.support:cardview-v7:$version"
    const val design = "com.android.support:design:$version"
    const val recyclerView = "com.android.support:recyclerview-v7:$version"
    const val v4 = "com.android.support:support-v4:$version"
}

object AndroidX {
    const val coreKtx = "androidx.core:core-ktx:1.0.2"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:1.0.0"
}

object Dagger {
    private const val version = "2.24"

    const val compiler = "com.google.dagger:dagger-compiler:$version"
    const val runtime = "com.google.dagger:dagger:$version"
}

object JUnit {
    private const val version = "5.5.1"

    const val api = "org.junit.jupiter:junit-jupiter-api:$version"
    const val engine = "org.junit.jupiter:junit-jupiter-engine:$version"
    const val four = "junit:junit:4.12"
    const val params = "org.junit.jupiter:junit-jupiter-params:$version"
    const val vintageEngine = "org.junit.vintage:junit-vintage-engine:$version"
}

object Kotlin {
    const val version = "1.3.50"

    const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib:$version"
}

object KotlinTest {
    private const val version = "3.4.0"

    const val assertions = "io.kotlintest:kotlintest-assertions:$version"
    const val core = "io.kotlintest:kotlintest-core:$version"
    const val runner = "io.kotlintest:kotlintest-runner-junit5:$version"
}

object KotlinDotTest {
    const val it = "org.jetbrains.kotlin:kotlin-test:${Kotlin.version}"
    const val junit = "org.jetbrains.kotlin:kotlin-test-junit:${Kotlin.version}"
    const val junit5 = "org.jetbrains.kotlin:kotlin-test-junit5:${Kotlin.version}"
}

object Mockito {
    const val it = "org.mockito:mockito-junit-jupiter:3.0.0"
    const val kotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:2.1.0"
}

object OkHttp {
    private const val version = "4.0.1"

    const val it = "com.squareup.okhttp3:okhttp:$version"
    const val logging = "com.squareup.okhttp3:logging-interceptor:$version"
}

object Retrofit {
    private const val version = "2.6.1"

    const val adapterRxJava = "com.squareup.retrofit2:adapter-rxjava2:$version"
    const val converterGson = "com.squareup.retrofit2:converter-gson:$version"
    const val it = "com.squareup.retrofit2:retrofit:$version"
}

object RxJava {
    const val it = "io.reactivex.rxjava2:rxjava:2.2.11"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:2.1.1"
    const val rxRelay = "com.jakewharton.rxrelay2:rxrelay:2.1.0"
}

object Spek {
    private const val version = "2.0.6"

    const val dsl = "org.spekframework.spek2:spek-dsl-jvm:$version"
    const val runner = "org.spekframework.spek2:spek-runner-junit5:$version"
}

object Unclassified {
    const val assertJ = "org.assertj:assertj-core:3.13.2"
    const val assertK = "com.willowtreeapps.assertk:assertk-jvm:0.19"
    const val detekt = "io.gitlab.arturbosch.detekt:detekt-cli:1.0.0"
    const val gson = "com.google.code.gson:gson:2.8.5"
    const val hamcrest = "org.hamcrest:hamcrest-all:1.3"
    const val kluent = "org.amshove.kluent:kluent:1.453"
    const val ktlint = "com.pinterest:ktlint:0.35.0"
    const val mockk = "io.mockk:mockk:1.9.3"
    const val rxLint = "nl.littlerobots.rxlint:rxlint:1.7.4"
    const val strikt = "io.strikt:strikt-core:0.21.1"
    const val timber = "com.jakewharton.timber:timber:4.7.1"
    const val truth = "com.google.truth:truth:1.0"
}