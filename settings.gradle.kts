plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "Mobiilikehityksen_suunnittelumallit"
include("src:main:Lab1")
findProject(":src:main:Lab1")?.name = "Lab1"
include("src:main:Lab1")
findProject(":src:main:Lab1")?.name = "Lab1"
include("src:main:Lab2")
findProject(":src:main:Lab2")?.name = "Lab2"
include("lab3")
include("Lab4")
