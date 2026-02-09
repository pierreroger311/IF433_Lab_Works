package oop_000000128411_PierreESMoningka.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.close() // Bersihkan buffer newLine (Penyakit klasik Scanner!)

    // Validasi di sisi pemanggil (Main)
    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        // Program berhenti disini untuk mahasiswa ini, tidak membuat objek
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.next()

        // Instansiasi Objek karena data sudah aman
        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }
}
