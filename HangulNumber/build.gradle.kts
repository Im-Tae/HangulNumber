import com.leaf.buildsrc.Configuration

android {
    compileSdk = Configuration.compileSdk
    namespace = "com.imtae.hangulnumber"

    defaultConfig {
        minSdk = Configuration.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            signingConfig = signingConfigs.getByName("debug")
        }
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    packaging {
        resources {
            excludes += "META-INF/proguard/androidx-annotations.pro"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlin {
        jvmToolchain(17)
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
}

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("com.vanniktech.maven.publish") version "0.29.0"
}

rootProject.extra.apply {
    val snapshot = System.getenv("SNAPSHOT").toBoolean()
    val libVersion =
        if (snapshot) {
            Configuration.snapshotVersionName
        } else {
            Configuration.versionName
        }
    set("libVersion", libVersion)
}

mavenPublishing {
    val artifactId = "hangul-number"
    coordinates(
        Configuration.artifactGroup,
        artifactId,
        rootProject.extra.get("libVersion").toString()
    )
    pom {
        name.set(artifactId)
        description.set("Convert Number to Korean.")
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    testImplementation(libs.junit)
}