package oop_000000128411_PierreESMoningka.TugasWeek06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Berhasil menambahkan ${device.name} ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n--- Mematikan Semua Perangkat ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}