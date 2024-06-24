plugins {
    kotlin("plugin.spring") version "1.6.10" // Ganti versi sesuai kebutuhan
    id("org.springframework.boot") version "2.7.18"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    java
}

group = "com.aripin.employee" // Ganti dengan nama group proyek Anda
version = "0.0.1-SNAPSHOT"     // Ganti dengan versi proyek Anda

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.h2database:h2") // Contoh untuk menggunakan H2 database
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks {
    withType<Test> {
        useJUnitPlatform()
    }
}
