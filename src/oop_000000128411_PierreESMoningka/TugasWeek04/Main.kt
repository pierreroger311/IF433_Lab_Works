package oop_000000128411_PierreESMoningka.TugasWeek04

fun main() {

    println("=== HIERARKI KARYAWAN ===")

    val manager = Manager(
        name = "Budi",
        baseSalary = 10_000_000
    )

    val developer = Developer(
        name = "Andi",
        baseSalary = 8_000_000,
        programmingLanguage = "Kotlin"
    )

    println("\n--- Manager ---")
    manager.work()
    println("Bonus ManagerS: Rp ${manager.calculateBonus()}")

    println("\n--- Developer ---")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}