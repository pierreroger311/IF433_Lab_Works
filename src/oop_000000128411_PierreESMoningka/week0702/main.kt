package oop_000000128411_PierreESMoningka.week0702

fun main() {
    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1) // Akan mencetak memori hash
    println("Sama? ${reg1 == reg2}") // False
}