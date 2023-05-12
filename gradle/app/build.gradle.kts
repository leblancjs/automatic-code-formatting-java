plugins {
    application
    id("com.diffplug.spotless") version "6.18.0"
    id("org.owasp.dependencycheck") version "8.2.1"
    id("org.springframework.boot") version "3.0.6"
    id("io.spring.dependency-management") version "1.1.0"
}

rootProject.group = "com.github.leblancjs.automatic_code_formatting_java"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.yaml:snakeyaml:2.0")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
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
