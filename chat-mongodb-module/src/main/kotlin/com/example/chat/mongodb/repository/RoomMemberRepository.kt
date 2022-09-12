package com.example.chat.mongodb.repository

import com.example.chat.mongodb.document.RoomMember
import org.springframework.data.mongodb.repository.MongoRepository

interface RoomMemberRepository : MongoRepository<RoomMember, String> {
}