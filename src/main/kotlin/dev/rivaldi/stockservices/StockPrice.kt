package dev.rivaldi.stockservices

import java.math.BigDecimal
import java.time.LocalDateTime

data class StockPrice(val symbol: String,
                      val price: BigDecimal,
                      val time: LocalDateTime)
