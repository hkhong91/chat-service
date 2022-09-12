package com.example.chat.mongodb.service

import com.example.chat.mongodb.document.RoomMessage
import com.example.chat.mongodb.repository.RoomMessageRepository
import org.springframework.stereotype.Component

@Component
class RoomMessageMongoService(
  private val roomMessageRepository: RoomMessageRepository,
) {
  fun create(message: RoomMessage) = roomMessageRepository.save(message)
}