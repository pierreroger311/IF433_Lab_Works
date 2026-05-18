package oop_000000128411_PierreESMoningka.TugasWeek13
import java.io.File
import java.io.FileNotFoundException

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("File tidak ditemukan: $path")
        emptyList()
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

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

fun main() {
    val path = "crypto_trades.csv"

    val simulatedTrades = listOf(
        TradeRecord(1, "BTCUSDT", "LONG", 150.0, 45.5),
        TradeRecord(2, "ETHUSDT", "SHORT", 100.0, -12.3),
        TradeRecord(3, "SOLUSDT", "LONG", 50.0, 8.8)
    )

    saveTrades(simulatedTrades, path)

    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

    val loadedData = loadTrades("crypto_trades.csv")
    val totalPnl = loadedData.sumOf { it.pnl }
}

