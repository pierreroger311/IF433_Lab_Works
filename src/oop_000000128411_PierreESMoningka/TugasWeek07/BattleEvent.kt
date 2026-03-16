package oop_000000128411_PierreESMoningka.TugasWeek07

sealed class BattleState {
    data class MonsterEncounter(val monsterName: String) : BattleState()
    data class LootDropped(val item: GameItem) : BattleState()
    data class GameOver(val reason: String) : BattleState()
    object SafeZone : BattleState()
}