package oop_000000128411_PierreESMoningka.TugasWeek03

class Player(val username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val oldLevel = level

            xp += amount
            println("$username mendapatkan $amount XP.")

            if (level > oldLevel) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        } else {
            println("ERROR: Amount XP harus positif!")
        }
    }

    fun displayStats() {
        println("Player: $username | Level: $level | Total XP: $xp")
    }
}