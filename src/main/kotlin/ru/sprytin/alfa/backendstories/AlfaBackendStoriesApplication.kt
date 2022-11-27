package ru.sprytin.alfa.backendstories

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@EnableCaching
@SpringBootApplication
class AlfaBackendStoriesApplication

fun main(args: Array<String>) {
	runApplication<AlfaBackendStoriesApplication>(*args)
}
