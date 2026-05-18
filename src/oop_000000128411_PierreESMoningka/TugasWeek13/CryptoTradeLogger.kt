package oop_000000128411_PierreESMoningka.TugasWeek13

import java.io.File
import java.io.FileNotFoundException

// Checkpoint 11
data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

// Checkpoint 12
fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

// Checkpoint 13 & 14
fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

// Checkpoint 15
fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

// Checkpoint 16
fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("File tidak ditemukan: $path")
        emptyList()
    }
}

fun main() {
    val path = "crypto_trades.csv"

    // Checkpoint 17
    val simulatedTrades = listOf(
        TradeRecord(1, "BTCUSDT", "LONG", 150.0, 45.5),
        TradeRecord(2, "ETHUSDT", "SHORT", 100.0, -12.3),
        TradeRecord(3, "SOLUSDT", "LONG", 50.0, 8.8)
    )
    saveTrades(simulatedTrades, path)

    // Checkpoint 18
    File(path).appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

    // Checkpoint 19
    val loadedData = loadTrades(path)
    val totalPnl = loadedData.sumOf { it.pnl }

    // Checkpoint 20
    println("\n=== VALID TRADES RECAP ===")
    loadedData.forEach { trade ->
        println("ID: ${trade.id} | ${trade.symbol} (${trade.type}) | Margin: $${trade.margin} | PnL: $${trade.pnl}")
    }
    println("==== TOTAL PnL BERSIH: $totalPnl ====")
}