dependencies {
  implementation("org.springframework.boot:spring-boot-starter-actuator")
  implementation("org.springframework.boot:spring-boot-starter-validation")
  implementation("org.springframework.boot:spring-boot-starter-web")

  implementation(project(":chat-mongodb-module"))
  implementation(project(":chat-redis-module"))
}
