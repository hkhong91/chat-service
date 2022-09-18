package com.example.chat.admin.service

import com.example.chat.admin.model.RoomAdminResponse
import com.example.chat.mongodb.service.RoomMongoService
import org.springframework.stereotype.Service

@Service
class RoomAdminService(
  private val roomMongoService: RoomMongoService,
) {
  fun searchRooms(): List<RoomAdminResponse> {
    return roomMongoService.getAll()
      .map { RoomAdminResponse.of(it) }
  }
}