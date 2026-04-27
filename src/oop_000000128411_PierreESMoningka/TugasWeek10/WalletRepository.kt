package oop_000000128411_PierreESMoningka.TugasWeek10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun find(predicate: (T) -> Boolean): T? {
        return items.find(predicate)
    }
}