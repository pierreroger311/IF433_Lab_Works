package oop_000000128411_PierreESMoningka.TugasWeek09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, 8.0, "OPEN"),
        TradeLog("BNBUSDT", "SHORT", 15, -12.4, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 25, 22.1, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, -2.5, "OPEN"),
        TradeLog("DOTUSDT", "LONG", 10, 4.5, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory.map { it.pair }.toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    println("--- TOP PERFORMERS ---")
    topPerformersString.forEach { println(it) }

    println("\n--- WORST PERFORMERS ---")
    worstPerformersString.forEach { println(it) }

    println("\n--- TRADED PAIRS ---")
    println(uniquePairs.joinToString(", "))
}