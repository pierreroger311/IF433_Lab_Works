package oop_000000128411_PierreESMoningka.TugasWeek05Task02

fun main() {
    // Checkpoint 4: Inisialisasi data
    val dompetBudi = EWallet("Budi", 50000.0)
    val kartuBudi = CreditCard("Budi", 100000.0)

    // Masukkan ke dalam list bertipe PaymentMethod (Polymorphism)
    val daftarPembayaran: List<PaymentMethod> = listOf(dompetBudi, kartuBudi)

    val tagihan = 75000.0

    for (metode in daftarPembayaran) {
        println("--- Mencoba pembayaran dengan ${metode.accountName} ---")

        // Panggilan awal (E-Wallet akan gagal di sini karena saldo 50rb < tagihan 75rb)
        metode.processPayment(tagihan)

        println("----------------------------------------------")
    }
}