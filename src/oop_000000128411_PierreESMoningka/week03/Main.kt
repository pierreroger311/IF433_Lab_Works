package oop_000000128411_PierreESMoningka.week03

fun main() {
    val e = Employee("Budi")
    
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformanceRating()

    println("Pajak yang harus dibayar: ${e.tax}")
}