package com.example.chat.socket

import com.example.chat.mongodb.ChatMongoDBConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(value = [ChatMongoDBConfiguration::class])
class ChatSocketApplication

fun main(args: Array<String>) {
  runApplication<ChatSocketApplication>(*args)
}
