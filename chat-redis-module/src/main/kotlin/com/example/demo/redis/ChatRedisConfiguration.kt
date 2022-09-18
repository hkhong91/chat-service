package com.example.demo.redis

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories

@Configuration
@ComponentScan("com.example.demo.redis")
@EnableRedisRepositories
class ChatRedisConfiguration {

  @Bean
  fun redisConnectionFactory(): RedisConnectionFactory = LettuceConnectionFactory()

  @Bean
  fun stringRedisTemplate(redisConnectionFactory: RedisConnectionFactory) = StringRedisTemplate(redisConnectionFactory)

  @Bean
  fun stringValueOperations(stringRedisTemplate: StringRedisTemplate) = stringRedisTemplate.opsForValue()

  @Bean
  fun stringSetOperations(stringRedisTemplate: StringRedisTemplate) = stringRedisTemplate.opsForSet()
}