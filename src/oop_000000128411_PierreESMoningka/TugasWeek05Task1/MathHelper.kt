package oop_000000128411_PierreESMoningka.TugasWeek05Task1

class MathHelper {

    fun hitungLuas(sisi: Int): Int {
        val hasil = sisi * sisi
        println("Menghitung Luas Persegi ($sisi x $sisi): $hasil")
        return hasil
    }

    fun hitungLuas(panjang: Int, lebar: Int): Int {
        val hasil = panjang * lebar
        println("Menghitung Luas Persegi Panjang ($panjang x $lebar): $hasil")
        return hasil
    }

    fun hitungLuas(jariJari: Double): Double {
        val hasil = 3.14 * jariJari * jariJari
        println("Menghitung Luas Lingkaran (r = $jariJari): $hasil")
        return hasil
    }
}