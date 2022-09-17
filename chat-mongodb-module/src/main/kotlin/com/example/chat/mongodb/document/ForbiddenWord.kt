package com.example.chat.mongodb.document

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document(collation = "ForbiddenWord")
data class ForbiddenWord(
  val word: String,
) {
  @Id
  val id: String? = null

  @CreatedDate
  var regDtTs: Instant? = null

  @LastModifiedDate
  var updDtTs: Instant? = null
}
