package oop_000000128411_PierreESMoningka.week0702

fun main() {
    println("\n=== TEST REGULAR CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1) // Otomatis readable format
    println("Sama? ${data1 == data2}") // True
}