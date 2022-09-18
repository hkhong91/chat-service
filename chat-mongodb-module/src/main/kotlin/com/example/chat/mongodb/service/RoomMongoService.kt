package com.example.chat.mongodb.service

import com.example.chat.mongodb.document.Room
import com.example.chat.mongodb.repository.RoomRepository
import org.springframework.stereotype.Component

@Component
class RoomMongoService(
  private val roomRepository: RoomRepository,
) {
  fun create(room: Room) = roomRepository.save(room)

  fun getAll() = roomRepository.findAll()
}