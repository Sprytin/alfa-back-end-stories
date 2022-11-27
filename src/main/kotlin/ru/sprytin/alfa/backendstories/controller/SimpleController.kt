package ru.sprytin.alfa.backendstories.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.sprytin.alfa.backendstories.service.CacheService

@RestController
class SimpleController(
    private val cacheService: CacheService
) {
    @GetMapping("/simple")
    suspend fun coroutineCache() = cacheService.simpleCache("SIMPLE_KEY")
}