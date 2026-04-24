package oop_000000128411_PierreESMoningka.week09

fun main() {
    println("=== TEST LIST ===")
    // Immutable List: Tidak bisa diubah setelah dibuat
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    // frameworks.add("Python") // UNCOMMENT INI AKAN ERROR!
    println("Immutable List: $frameworks")

    // Mutable List: Bisa ditambah/dikurangi
    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    println("\n=== TEST SET ===")
    val uniqueNumber = setOf(1, 2, 2, 3, 3, 4)
    println("Unique Numbers (Set): $uniqueNumber") // Duplikat hilang

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA") // Diabaikan karena sudah ada
    println("Active Users: $activeUsers")
}