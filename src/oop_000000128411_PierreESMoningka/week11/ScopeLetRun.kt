package oop_000000128411_PierreESMoningka.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    // Mengeksekusi blok hanya jika objek tidak null
    val length = name?.let {
        println("Nama terdeteksi: $it") // 'it' merujuk pada name
        it.length // Mengembalikan nilai expression terakhir
    }
    println("Panjang nama: $length")

    println("\n=== TEST RUN FUCNTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}") // 'this' bisa dihilangkan (implicit)
        length * 2
    }
    println("Hasil kalkulasi run: $result")
}