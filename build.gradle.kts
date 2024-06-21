/// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
    }

    dependencies {
        //classpath(libs.androidx.navigation.safe.args.gradle.plugin)
        classpath(libs.androidx.navigation.safe.args.gradle.plugin.v277)
    }
}


plugins {
    id ("com.android.application") version "8.5.0" apply false
    id ("com.android.library") version "8.5.0" apply false
    id ("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false
}