package com.example.chat.socket

import com.example.chat.mongodb.ChatMongoDBConfiguration
import com.example.demo.redis.ChatRedisConfiguration
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(
  value = [
    ChatMongoDBConfiguration::class,
    ChatRedisConfiguration::class,
  ]
)
class ChatSocketApplication {
  @Bean
  fun objectMapper() = ObjectMapper()
}

fun main(args: Array<String>) {
  runApplication<ChatSocketApplication>(*args)
}
