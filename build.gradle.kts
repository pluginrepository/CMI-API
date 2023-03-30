plugins {
    id("featherpatcher") version "0.0.1"
}

feather {
    this.datafolder(rootProject.projectDir.toPath())

    this.workspace("workspace")

    this.autoupdate(true)

    this.url("https://github.com/Zrips/CMI-API.git")
}