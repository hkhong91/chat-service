package com.example.chat.mongodb.document

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document(collation = "Room")
data class Room(
  @Id
  val id: String,

  var title: String,

  var tags: Set<String>,

  var imageUrl: String,
) {
  var joinCount: Int = 0

  var likeCount: Int = 0

  @CreatedDate
  var regDtTs: Instant? = null

  @LastModifiedDate
  var updDtTs: Instant? = null
}