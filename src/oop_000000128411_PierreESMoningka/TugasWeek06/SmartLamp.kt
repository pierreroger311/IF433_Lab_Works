package oop_000000128411_PierreESMoningka.TugasWeek06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("[$name] menyala dengan kecerahan 80%.")
    }

    override fun turnOff() {
        println("[$name] dimatikan.")
    }
}