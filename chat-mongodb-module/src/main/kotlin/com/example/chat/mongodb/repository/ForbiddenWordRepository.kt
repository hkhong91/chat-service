package com.example.chat.mongodb.repository

import com.example.chat.mongodb.document.ForbiddenWord
import org.springframework.data.mongodb.repository.MongoRepository

interface ForbiddenWordRepository : MongoRepository<ForbiddenWord, String> {
}