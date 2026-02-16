package oop_000000128411_PierreESMoningka.TugasWeek03

class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            when {
                value < 0 -> {
                    println("WARNING: Damage [$value] tidak valid (negatif)! Nilai tetap: $field")
                }
                value > 1000 -> {
                    println("WARNING: Damage [$value] terlalu OP! Dipaksa menjadi 1000.")
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }

    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }

    fun displayStats() {
        println("Weapon: $name | Damage: $damage | Tier: $tier")
    }
}