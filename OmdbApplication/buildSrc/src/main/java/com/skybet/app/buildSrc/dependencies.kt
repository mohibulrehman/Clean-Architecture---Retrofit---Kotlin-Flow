package com.skybet.app.buildSrc

/**
 * We have included some core libraries to get you started,
 * Add any other libraries you deem necessary and be prepared to explain why.
 */
object Libs {

    const val androidGradlePlugin = "com.android.tools.build:gradle:7.3.0"

    object Google {
        const val gson = "com.google.code.gson:gson:2.8.7"
    }

    object Kotlin {
        private const val version = "1.6.10"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val reflect = "org.jetbrains.kotlin:kotlin-reflect:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.9.0"
        const val appCompat = "androidx.appcompat:appcompat:1.4.2"
        const val material = "com.google.android.material:material:1.6.1"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"

        object Navigation {
            private const val version = "2.3.5"
            const val ui = "androidx.navigation:navigation-ui-ktx:$version"
            const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
        }

        object Compose {
            const val version = "1.1.1"
            const val ui = "androidx.compose.ui:ui:$version"
            const val material = "androidx.compose.material:material:$version"
            const val preview = "androidx.compose.ui:ui-tooling-preview:$version"
            const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1"
            const val activity = "androidx.activity:activity-compose:1.6.0"
            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07"
        }

        object Hilt {
            private const val version = "1.0.0"
            const val compiler = "androidx.hilt:hilt-compiler:$version"
        }
    }

    object Glide {
        const val library = "com.github.bumptech.glide:glide:4.13.2"
        const val compiler = "com.github.bumptech.glide:compiler:4.13.2"

        object Compose {
            const val library = "com.github.skydoves:landscapist-glide:1.5.2"
        }
    }

    object Retrofit {
        private const val version = "2.8.1"
        const val retrofit = "com.squareup.retrofit2:retrofit:$version"
        const val moshiConverter = "com.squareup.retrofit2:converter-moshi:$version"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:$version"
    }

    object Moshi {
        private const val version = "1.13.0"
        const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:$version"
        const val moshiKotlinCodegen = "com.squareup.moshi:moshi-kotlin-codegen:$version"
        const val moshiAdapters = "com.squareup.moshi:moshi-adapters:$version"
    }

    object DI {
        object Hilt {
            private const val version = "2.40.5"
            const val library = "com.google.dagger:hilt-android:$version"
            const val compiler = "com.google.dagger:hilt-android-compiler:$version"
            const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
        }

        object Koin {
            private const val version = "3.2.0"
            const val koin =  "io.insert-koin:koin-android:$version"
        }
    }
}