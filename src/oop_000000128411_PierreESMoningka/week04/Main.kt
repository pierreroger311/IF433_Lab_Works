package oop_000000128411_PierreESMoningka.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("--- Testing Car ---")
    val myCar = Car(brand = "Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("--- Testing Electric Car ---")
    val tesla = ElectricCar("Tesla", 4, 85)
    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()
}