package com.example.chat.admin.controller

import com.example.chat.admin.model.RoomAdminResponse
import com.example.chat.admin.service.RoomAdminService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RoomAdminController(
  private val roomAdminService: RoomAdminService,
) {
  @GetMapping("/rooms")
  fun searchRooms(): List<RoomAdminResponse> = roomAdminService.searchRooms()
}