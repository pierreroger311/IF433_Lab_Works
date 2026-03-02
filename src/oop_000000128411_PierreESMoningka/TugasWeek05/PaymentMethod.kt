package oop_000000128411_PierreESMoningka.TugasWeek05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}