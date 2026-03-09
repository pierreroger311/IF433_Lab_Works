package oop_000000128411_PierreESMoningka.week06

fun processChecckout(method: PaymentMethod, amount : Double) {
    println("-> Memulai checkout...")
    method.pay(amount) // Dynamic polymorphism in action
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smarthphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processChecckout( method = pay1, amount = 50000.0)
    processChecckout( method = pay2, amount = 150000.0)
}