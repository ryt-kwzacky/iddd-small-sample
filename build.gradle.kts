import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kotlinVersion by extra("1.3.72")
val springBootVersion by extra("2.3.2.RELEASE")

plugins {
	id("org.springframework.boot") version "2.3.2.RELEASE"
	id("io.spring.dependency-management") version "1.0.9.RELEASE"
	kotlin("jvm") version "1.3.72"
	kotlin("plugin.spring") version "1.3.72"
}

group = "com.create-user"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_13

repositories {
	mavenCentral()
}

dependencies {
	/**
	 * Spring Boot Starters
	 */
	implementation("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
	testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootVersion")

	/**
	 * Java Database Connectivity (JDBC) is an application programming interface (API) for the programming language Java,
	 * which defines how a client may access a database.
	 * This is used for migration, etc.
	 */
	// implementation("org.springframework.boot:spring-boot-starter-jdbc:$springBootVersion")

	/**
	 * Libraries to use Kotlin.
	 */
	implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion")

	/**
	 * This is to add support for serialization/deserialization of Kotlin classes and data classes.
	 *
	 * Github
	 * @link https://github.com/FasterXML/jackson-module-kotlin
	 */
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.11.2")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}
