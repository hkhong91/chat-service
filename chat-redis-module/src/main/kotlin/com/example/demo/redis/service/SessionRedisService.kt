package com.example.demo.redis.service

import org.springframework.data.redis.core.SetOperations
import org.springframework.stereotype.Service

@Service
class SessionRedisService(
  private val stringSetOperations: SetOperations<String, String>,
)