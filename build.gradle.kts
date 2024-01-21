import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("org.springframework.boot") version "3.2.2"
  id("io.spring.dependency-management") version "1.1.4"
  kotlin("jvm") version "1.9.22"
  kotlin("plugin.spring") version "1.9.22"
  kotlin("plugin.jpa") version "1.9.22"
}

group = "me.sidd88"
version = "0.0.1-SNAPSHOT"

java {
  sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
  mavenCentral()
}

dependencies {

  // --[ OSS ]----------------------------------------------
  implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.10")
  implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.0.4")
  implementation("org.springframework.boot:spring-boot-starter-thymeleaf:3.0.4")
  implementation("org.springframework.boot:spring-boot-starter-web:3.1.0")
  implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.2")

  // --[ Development Only ]---------------------------------
  developmentOnly("org.springframework.boot:spring-boot-devtools:3.0.4")

  // --[ Runtime Only ]-------------------------------------
  runtimeOnly("com.mysql:mysql-connector-j:8.3.0")
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs += "-Xjsr305=strict"
    jvmTarget = "21"
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
}
