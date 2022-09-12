package com.example.chat.mongodb.repository

import com.example.chat.mongodb.document.Friend
import org.springframework.data.mongodb.repository.MongoRepository

interface FriendRepository : MongoRepository<Friend, String> {
}