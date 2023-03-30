pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()

        maven("https://repo.papermc.io/repository/maven-public/")
        maven("https://repo.crazycrew.us/api")
    }
}

rootProject.name = "CMI-API"

include("workspace")