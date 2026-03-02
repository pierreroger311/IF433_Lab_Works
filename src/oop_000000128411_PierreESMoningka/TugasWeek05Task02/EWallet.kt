package oop_000000128411_PierreESMoningka.TugasWeek05Task02

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName - E-Wallet] Pembayaran Rp$amount berhasil. Sisa saldo: Rp$balance")
        } else {
            println("[$accountName - E-Wallet] Saldo tidak cukup untuk transaksi Rp$amount.")
        }
    }

    // Fungsi khusus yang hanya ada di EWallet
    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName - E-Wallet] Berhasil Top Up Rp$amount. Saldo sekarang: Rp$balance")
    }
}