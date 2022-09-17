package com.example.chat.mongodb.document

import com.example.chat.mongodb.value.MemberStatus
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document(collation = "RoomMember")
data class RoomMember(
  val roomId: String,

  val memberId: String,
) {
  @Id
  val id: String? = null

  val status: MemberStatus = MemberStatus.JOINED

  @CreatedDate
  var regDtTs: Instant? = null

  @LastModifiedDate
  var updDtTs: Instant? = null
}