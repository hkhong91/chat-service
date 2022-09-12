package com.example.chat.socket

import com.example.chat.socket.handler.MessageHandler
import org.springframework.context.annotation.Configuration
import org.springframework.web.socket.config.annotation.EnableWebSocket
import org.springframework.web.socket.config.annotation.WebSocketConfigurer
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor

@Configuration
@EnableWebSocket
class ChatWebSocketConfigurer(
  private val messageHandler: MessageHandler,
) : WebSocketConfigurer {
  override fun registerWebSocketHandlers(registry: WebSocketHandlerRegistry) {
    registry.addHandler(messageHandler, "/messages")
      .setAllowedOrigins("*")
      .addInterceptors(HttpSessionHandshakeInterceptor())
  }
}