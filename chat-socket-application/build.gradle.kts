dependencies {
  implementation("org.springframework.boot:spring-boot-starter-websocket")

  implementation(project(":chat-mongodb-module"))
  implementation(project(":chat-redis-module"))
}
