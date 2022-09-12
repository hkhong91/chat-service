package com.example.chat.socket.service

import com.example.chat.mongodb.document.RoomMessage
import com.example.chat.mongodb.service.RoomMessageMongoService
import org.springframework.stereotype.Service

@Service
class MessageService(
  private val roomMessageMongoService: RoomMessageMongoService,
) {
  fun create(roomMessage: RoomMessage): RoomMessage {
    return roomMessageMongoService.create(roomMessage)
  }
}