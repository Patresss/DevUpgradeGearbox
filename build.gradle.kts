plugins {
    kotlin("jvm") version "1.3.72"
    id("com.adarshr.test-logger") version "2.0.0"
    application
}

group = "com.patres"
version = "1.0-SNAPSHOT"

application {
    mainClassName = "com.patres.gearbox.GearboxApplicationKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation("io.kotest:kotest-runner-junit5-jvm:4.0.5")
    testImplementation("io.kotest:kotest-assertions-core-jvm:4.0.5")
    testImplementation("io.kotest:kotest-property-jvm:4.0.5")

    implementation("log4j:log4j:1.2.17")
    implementation("org.slf4j:slf4j-api:1.7.5")
    implementation("org.slf4j:slf4j-log4j12:1.7.5")

}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}