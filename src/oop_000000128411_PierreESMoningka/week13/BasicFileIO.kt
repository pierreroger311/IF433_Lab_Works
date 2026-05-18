package oop_000000128411_PierreESMoningka.week13

fun main() {
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisialisasi sistem.\n")
    println("File berhasil dibuat dan ditulis.")

    file.appendText("Line 2: Menambahkan konfigurasi baru.\n")
    println("Teks berhasil di-append.")
}