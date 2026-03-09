package oop_000000128411_PierreESMoningka.week06

interface Clickable {
    // ERROR: property is an interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    // Function without body (Implicity Abstract)
    fun click()
}