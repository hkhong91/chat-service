package com.example.chat.mongodb.repository

import com.example.chat.mongodb.document.RoomMessage
import org.springframework.data.mongodb.repository.MongoRepository

interface RoomMessageRepository : MongoRepository<RoomMessage, String> {
}