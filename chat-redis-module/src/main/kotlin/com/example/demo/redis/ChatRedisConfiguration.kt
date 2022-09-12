package com.example.demo.redis

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories

@Configuration
@EnableRedisRepositories
class ChatRedisConfiguration {

  @Bean
  fun stringRedisTemplate() = StringRedisTemplate()

  @Bean
  fun stringValueOperations(stringRedisTemplate: StringRedisTemplate) = stringRedisTemplate.opsForValue()

  @Bean
  fun stringSetOperations(stringRedisTemplate: StringRedisTemplate) = stringRedisTemplate.opsForSet()
}