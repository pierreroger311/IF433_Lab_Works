package oop_000000128411_PierreESMoningka.week03

fun main() {
    val e = Employee("Budi")
    println("--- Test Error ---")
    e.salary = 5000 // Ini akan meledakkan program anda
}