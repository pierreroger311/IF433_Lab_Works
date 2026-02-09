package oop_000000128411_PierreESMoningka.TugasWeek02

fun main() {
    val hero1 = Hero("Knight", 20)
    val hero2 = Hero("Goblin", 15)

    hero1.attack(hero2.name)
    hero2.takeDamage(hero1.baseDamage)

    hero2.attack(hero1.name)
    hero1.takeDamage(hero2.baseDamage)

    println("\nStatus Akhir:")
    println("${hero1.name} hidup? ${hero1.isAlive()}")
    println("${hero2.name} hidup? ${hero2.isAlive()}")
}
