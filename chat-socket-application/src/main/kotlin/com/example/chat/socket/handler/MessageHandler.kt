package com.example.chat.socket.handler

import com.example.chat.mongodb.document.RoomMessage
import com.example.chat.socket.service.MessageService
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Component
import org.springframework.web.socket.TextMessage
import org.springframework.web.socket.WebSocketSession
import org.springframework.web.socket.handler.TextWebSocketHandler

@Component
class MessageHandler(
  private val messageService: MessageService,
  private val objectMapper: ObjectMapper,
) : TextWebSocketHandler() {

  override fun handleTextMessage(session: WebSocketSession, message: TextMessage) {
    messageService.create(
      roomMessage = objectMapper.readValue(message.payload, RoomMessage::class.java)
    )

    super.handleTextMessage(session, message)
  }
}