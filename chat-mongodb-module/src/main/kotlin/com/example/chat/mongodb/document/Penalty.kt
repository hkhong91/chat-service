package com.example.chat.mongodb.document

import com.example.chat.mongodb.value.PenaltyType
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document(collation = "Penalty")
data class Penalty(
  val userId: String,

  val type: PenaltyType,

  val expiredDtTs: Instant,
) {
  @Id
  val id: String? = null

  @CreatedDate
  var regDtTs: Instant? = null

  @LastModifiedDate
  var updDtTs: Instant? = null
}