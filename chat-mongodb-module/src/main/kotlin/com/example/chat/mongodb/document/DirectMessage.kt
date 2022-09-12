package com.example.chat.mongodb.document

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document(collation = "DirectMessage")
data class DirectMessage(
  @Id
  val id: String,

  val senderId: String,

  val receiverId: String,

  val content: String,
) {
  @CreatedDate
  var regDtTs: Instant? = null

  @LastModifiedDate
  var updDtTs: Instant? = null
}
