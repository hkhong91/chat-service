package com.example.chat.socket.controller

import com.example.chat.socket.message.HelloMessage
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller

@Controller
class MessageController {

  @MessageMapping("/messages")
  @SendTo("/topic/public")
  fun sendMessage(@Payload message: HelloMessage): HelloMessage {
    return message
  }
}