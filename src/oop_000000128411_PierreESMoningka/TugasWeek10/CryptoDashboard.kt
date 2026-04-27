package oop_000000128411_PierreESMoningka.TugasWeek10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.523))
    coinRepo.add(Coin("ETH", 4.15))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("Response Status: ${response.status}")
    println("--- Coin List ---")
    response.data.forEach { coin ->
        println("Coin: ${coin.name} | Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-9901", 0.05))
    txRepo.add(Transaction("TX-9902", 150.0))

    println("\n--- Recent Transactions ---")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id} | Amount: ${tx.amount}")
    }
}