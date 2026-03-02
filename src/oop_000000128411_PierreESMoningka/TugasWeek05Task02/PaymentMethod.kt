package oop_000000128411_PierreESMoningka.TugasWeek05Task02

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}