package com.example.chat.admin

import com.example.chat.mongodb.ChatMongoDBConfiguration
import com.example.demo.redis.ChatRedisConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(
  value = [
    ChatMongoDBConfiguration::class,
    ChatRedisConfiguration::class,
  ]
)
class ChatAdminApplication

fun main(args: Array<String>) {
  runApplication<ChatAdminApplication>(*args)
}
