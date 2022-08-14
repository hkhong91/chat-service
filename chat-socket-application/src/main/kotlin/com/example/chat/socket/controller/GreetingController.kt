package com.example.chat.socket.controller

import com.example.chat.socket.message.Greeting
import com.example.chat.socket.message.HelloMessage
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller
import org.springframework.web.util.HtmlUtils

@Controller
class GreetingController {

  @MessageMapping("/hello")
  @SendTo("/topic/greetings")
  fun sendMessage(@Payload message: HelloMessage): Greeting {
    return Greeting("Hello, " + HtmlUtils.htmlEscape(message.name) + "!")
  }
}