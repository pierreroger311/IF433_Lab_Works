package oop_000000128411_PierreESMoningka.TugasWeek11

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)

fun SmartDevice.diagnose(): String {
    return "[DIAGNOSTIK] $name | Kategori: $category | Status: ${if (isOnline) "Online" else "Offline"} | Daya: $powerLoad Watt"
}

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
}

