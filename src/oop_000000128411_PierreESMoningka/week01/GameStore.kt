package oop_000000128411_PierreESMoningka.week01

fun main() {
    val gameTitle = "Call of Duty"
    val price = 899000

    val finalPrice = printReceipt(originalPrice = price)

    println("Game Title: $gameTitle")
    println("Normal Price: $price")
    println("Final Price: $finalPrice")
}

fun printReceipt(originalPrice: Int): Double = if (originalPrice > 500000) {
    originalPrice * 0.8
} else {
    originalPrice * 0.9
}