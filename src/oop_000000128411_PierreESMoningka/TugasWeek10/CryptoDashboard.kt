package oop_000000128411_PierreESMoningka.TugasWeek10

fun main() {
    // Inisialisasi Coin Repository
    val coinRepo = WalletRepository<Coin>()

    // Mengisi Data
    coinRepo.add(Coin("BTC", 0.523))
    coinRepo.add(Coin("ETH", 4.15))
    coinRepo.add(Coin("USDT", 1500.0))

    // Simulasi Response API
    val response = ApiResponse("200 OK", coinRepo.getAll())

    // Menampilkan Dashboard
    println("=== CRYPTO WALLET SYSTEM ===")
    println("Response Status: ${response.status}")
    println("--- My Assets ---")
    response.data.forEach { coin ->
        println("Asset: ${coin.name.padEnd(5)} | Balance: ${coin.balance}")
    }

    // Inisialisasi & Isi Transaction Repository
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-1001", 0.05))
    txRepo.add(Transaction("TX-1002", 150.0))

    println("\n--- Transaction History ---")
    txRepo.getAll().forEach { tx ->
        println("Order ID: ${tx.id} | Val: ${tx.amount}")
    }
}