plugins {
    application
    checkstyle
}
application{
    mainClass = "hexlet.code.app.App"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(20))
    }
}
val run by tasks.getting(JavaExec::class) {
    standardInput = System.`in`
}



