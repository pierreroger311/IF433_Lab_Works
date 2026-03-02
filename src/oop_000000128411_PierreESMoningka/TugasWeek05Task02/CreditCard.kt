package oop_000000128411_PierreESMoningka.TugasWeek05Task02

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName - Credit Card] Pembayaran Rp$amount sukses. Total tagihan: Rp$usedAmount")
        } else {
            println("[$accountName - Credit Card] Transaksi Rp$amount ditolak: Melebihi limit.")
        }
    }
}