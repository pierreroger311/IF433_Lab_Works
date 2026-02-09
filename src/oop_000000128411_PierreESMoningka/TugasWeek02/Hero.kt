package oop_000000128411_PierreESMoningka.TugasWeek02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {

    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage

        // Pastikan HP tidak minus
        if (hp < 0) {
            hp = 0
        }

        println("$name menerima $damage damage. HP sekarang: $hp")
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}
