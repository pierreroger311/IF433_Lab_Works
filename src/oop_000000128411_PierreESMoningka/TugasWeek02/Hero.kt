import java.util.Scanner

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack(targetName: String) {
        println("$name menyerang $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Damage Hero: ")
    val heroDamage = scanner.nextInt()

    val hero = Hero(heroName, heroDamage)
    var enemyHp = 100

    println("\n=== BATTLE DIMULAI ===")

    while (hero.isAlive() && enemyHp > 0) {
        println("\nHP $heroName: ${hero.hp}")
        println("HP Musuh   : $enemyHp")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Musuh")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("Musuh terkena ${hero.baseDamage} damage!")
            println("Sisa HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh membalas serangan!")
                hero.takeDamage(enemyDamage)
                println("$heroName menerima $enemyDamage damage")
                println("Sisa HP $heroName: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("$heroName kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")
    if (hero.hp > 0 && enemyHp <= 0) {
        println("$heroName MENANG!")
    } else if (hero.hp <= 0 && enemyHp > 0) {
        println("Musuh MENANG!")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}
