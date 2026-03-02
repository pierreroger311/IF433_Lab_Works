package oop_000000128411_PierreESMoningka.TugasWeek05Task02

fun main() {
    val dompetBudi = EWallet("Budi", 50000.0)
    val kartuBudi = CreditCard("Budi", 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(dompetBudi, kartuBudi)

    val tagihan = 75000.0

    for (metode in daftarPembayaran) {
        println("--- Mencoba pembayaran dengan ${metode.accountName} ---")

        metode.processPayment(tagihan)

        if (metode is EWallet) {
            println("Info: Mendeteksi E-Wallet. Melakukan Auto Top-Up...")

            metode.topUp(50000.0)

            println("Mencoba ulang pembayaran...")
            metode.processPayment(tagihan)
        }

        println("----------------------------------------------")
    }
}