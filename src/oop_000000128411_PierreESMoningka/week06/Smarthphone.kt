package oop_000000128411_PierreESMoningka.week06

class Smarthphone : Camera, Phone {
    // Manually override to resolve ambuigity
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}