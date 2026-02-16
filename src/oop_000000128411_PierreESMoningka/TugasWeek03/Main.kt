package oop_000000128411_PierreESMoningka.TugasWeek03

fun main() {
    val sword = Weapon("Stormbreaker")

    sword.damage = 600
    println("Tier saat ini: ${sword.tier}")

    sword.damage = 1500
    sword.displayStats()

    sword.damage = -10
    sword.displayStats()
    sword.displayStats()
}