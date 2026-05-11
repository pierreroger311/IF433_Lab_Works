package oop_000000128411_PierreESMoningka.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double,
) : Exception("Attempted $amount balance: $balance")