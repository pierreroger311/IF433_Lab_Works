package oop_000000128411_PierreESMoningka.TugasWeek07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Awas! Muncul monster ${event.monsterName}!")
        }
        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Hore! Mendapatkan item: $name (Atk: $damage, Kelangkaan: $rarity)")
        }
        is BattleState.GameOver -> {
            println("Permainan Berakhir! Alasan: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Memasuki zona aman. Silakan beristirahat.")
        }
    }
}