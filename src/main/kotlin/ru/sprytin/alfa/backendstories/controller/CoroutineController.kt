package ru.sprytin.alfa.backendstories.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import ru.sprytin.alfa.backendstories.service.CacheService

@RestController
class CoroutineController(
    private val cacheService: CacheService
) {
    @GetMapping("/coroutine")
    suspend fun coroutineCache() = cacheService.coroutineCache("SIMPLE_KEY")
}