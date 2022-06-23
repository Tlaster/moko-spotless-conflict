plugins {
    kotlin("multiplatform")
    id("dev.icerock.mobile.multiplatform-resources") version Versions.moko
}
kotlin {
    ios()
    jvm()
    sourceSets {
        val commonMain by getting
        val commonTest by getting
    }
}
multiplatformResources {
    multiplatformResourcesPackage = "moe.tlaster.moko.sample"
}
