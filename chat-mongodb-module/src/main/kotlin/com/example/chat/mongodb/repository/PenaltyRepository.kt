package com.example.chat.mongodb.repository

import com.example.chat.mongodb.document.Penalty
import org.springframework.data.mongodb.repository.MongoRepository

interface PenaltyRepository : MongoRepository<Penalty, String> {
}