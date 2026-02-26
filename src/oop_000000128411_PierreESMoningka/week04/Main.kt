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
}