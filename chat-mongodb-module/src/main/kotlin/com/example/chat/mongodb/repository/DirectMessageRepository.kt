package com.example.chat.mongodb.repository

import com.example.chat.mongodb.document.DirectMessage
import org.springframework.data.mongodb.repository.MongoRepository

interface DirectMessageRepository : MongoRepository<DirectMessage, String> {
}