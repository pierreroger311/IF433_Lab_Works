package oop_000000128411_PierreESMoningka.TugasWeek06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("[$name] Lensa terbuka dan sensor gerak aktif.")
        startRecord() // Memanggil otomatis saat menyala
    }

    override fun turnOff() {
        println("[$name] Lensa tertutup.")
        stopRecord()
    }

    override fun startRecord() {
        println("[$name] Mulai merekam video ke storage...")
    }
}