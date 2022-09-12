package com.example.chat.mongodb

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.EnableMongoAuditing
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@Configuration
@ComponentScan("com.example.chat.mongodb")
@EnableAutoConfiguration
@EnableMongoAuditing
@EnableMongoRepositories
class ChatMongoDBConfiguration