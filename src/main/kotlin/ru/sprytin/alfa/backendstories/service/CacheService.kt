package ru.sprytin.alfa.backendstories.service

import kotlinx.coroutines.coroutineScope
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

private const val CACHED_VALUE = "CACHED_VALUE"

@Service
class CacheService {

    @Cacheable("reactive")
    fun reactiveCache(key: String): Mono<String> {
        return Mono.just(CACHED_VALUE)
    }

    @Cacheable("coroutine")
    suspend fun coroutineCache(key: String) = coroutineScope {
        CACHED_VALUE
    }

    @Cacheable("simple")
    fun simpleCache(key: String): String {
        return CACHED_VALUE
    }
}