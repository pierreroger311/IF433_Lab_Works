package oop_000000128411_PierreESMoningka.TugasWeek06

fun main() {
    // Instansiasi Perangkat
    val lampuTamu = SmartLamp("L01", "Ruang Tamu")
    val googleNest = SmartSpeaker("S01", "Google Nest Dapur")
    val ezvizGarasi = SmartCCTV("C01", "Ezviz Garasi")

    val myHub = SmartHomeHub()
    myHub.addDevice(lampuTamu)
    myHub.addDevice(googleNest)
    myHub.addDevice(ezvizGarasi)

    myHub.activateSecurityMode()
    myHub.turnOffAllSwitches()
}