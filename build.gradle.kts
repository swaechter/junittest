plugins {
    id("java")
}

group = "ch.swaechter"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Switch to JUnit version 5.12.0 to reproduce the error
    testImplementation(platform("org.junit:junit-bom:5.11.4"))
    //testImplementation(platform("org.junit:junit-bom:5.12.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
