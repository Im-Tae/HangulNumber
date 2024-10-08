package com.leaf.buildsrc

object Configuration {
    const val compileSdk = 34
    const val targetSdk = 34
    const val minSdk = 21
    const val majorVersion = 1
    const val minorVersion = 0
    const val patchVersion = 1
    const val versionName = "$majorVersion.$minorVersion.$patchVersion"
    const val versionCode = 1
    const val snapshotVersionName = "$majorVersion.$minorVersion.${patchVersion + 1}-SNAPSHOT"
    const val artifactGroup = "io.github.im-tae"
}