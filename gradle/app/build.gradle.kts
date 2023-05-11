plugins {
    application
    id("com.diffplug.spotless") version "6.18.0"
}

rootProject.group = "com.github.leblancjs.automatic_code_formatting_java"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
}

application {
    mainClass.set("com.github.leblancjs.automatic_code_formatting_java.gradle.App")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

spotless {
    java {
        googleJavaFormat()
    }
}
