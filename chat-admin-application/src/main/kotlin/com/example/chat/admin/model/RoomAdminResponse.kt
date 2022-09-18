package com.example.chat.admin.model

import com.example.chat.mongodb.document.Room
import java.time.Instant

data class RoomAdminResponse(
  val id: String,
  var title: String,
  var tags: Set<String>,
  var imageUrl: String,
  var joinCount: Int,
  var likeCount: Int,
  var regDtTs: Instant,
  var updDtTs: Instant,
) {
  companion object {
    fun of(room: Room) = RoomAdminResponse(
      id = room.id!!,
      title = room.title,
      tags = room.tags,
      imageUrl = room.imageUrl,
      joinCount = room.joinCount,
      likeCount = room.likeCount,
      regDtTs = room.regDtTs!!,
      updDtTs = room.updDtTs!!,
    )
  }
}