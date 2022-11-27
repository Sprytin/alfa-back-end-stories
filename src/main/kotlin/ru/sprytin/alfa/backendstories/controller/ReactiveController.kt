package ru.sprytin.alfa.backendstories.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import ru.sprytin.alfa.backendstories.service.CacheService

@RestController
class ReactiveController(
    private val cacheService: CacheService
) {
    @GetMapping("/reactive")
    fun reactiveCache(): Mono<String> {
        return cacheService.reactiveCache("SIMPLE_KEY")
    }
}