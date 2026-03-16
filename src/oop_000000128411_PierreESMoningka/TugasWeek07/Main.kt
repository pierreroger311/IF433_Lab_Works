package oop_000000128411_PierreESMoningka.TugasWeek07

fun main() {
    // Simulasi Singleton
    GameManager.startGame()
    GameManager.startGame()

    println("\n--- Simulasi Rarity & Factory ---")
    // Drop chance Legendary
    println("Drop chance item LEGENDARY adalah: ${ItemRarity.LEGENDARY.dropChance}%")

    // Factory pattern
    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata awal: ${starterWeapon.item.name} dengan durability ${starterWeapon.durability}")

    println("\n--- Simulasi Event & Immutability ---")
    // Upgrade dengan copy()
    val upgradedItem = starterWeapon.item.copy(name = "Pedang Kayu Upgrade", damage = 25)

    // Simulasi event berurutan
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}