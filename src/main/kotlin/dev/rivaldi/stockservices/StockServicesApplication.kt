package dev.rivaldi.stockservices

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StockServicesApplication

fun main(args: Array<String>) {
    runApplication<StockServicesApplication>(*args)
}
