package oop_000000128411_PierreESMoningka.TugasWeek03 // Pastikan package sama dengan file lain

fun main() {
    // --- TESTING TUGAS 2: PLAYER ---
    println("=== TESTING PLAYER ===")
    val player1 = Player("Pierre")
    player1.displayStats()
    player1.displayStats()

    player1.addXp(50)
    player1.addXp(60) // Ini akan memicu Level Up
    player1.displayStats()

    println("\n=== TESTING WEAPON ===")
    // --- TESTING TUGAS 1: WEAPON ---
    val sword = Weapon("Stormbreaker")

    sword.damage = 600
    println("Tier saat ini: ${sword.tier}")

    sword.damage = 1500 // Akan kena sensor "Overpowered"
    sword.displayStats()

    sword.damage = -10 // Akan ditolak
    sword.displayStats()
}