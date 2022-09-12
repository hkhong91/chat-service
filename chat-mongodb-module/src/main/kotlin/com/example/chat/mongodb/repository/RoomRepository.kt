package com.example.chat.mongodb.repository

import com.example.chat.mongodb.document.Room
import org.springframework.data.mongodb.repository.MongoRepository

interface RoomRepository : MongoRepository<Room, String> {
}