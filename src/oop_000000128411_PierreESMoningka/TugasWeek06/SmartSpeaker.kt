package oop_000000128411_PierreESMoningka.TugasWeek06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("[$name] Aktif: 'Halo Pierre, ada yang bisa dibantu?'")
    }

    override fun turnOff() {
        println("[$name] Masuk ke mode standby.")
    }

    fun playMusic(song: String) {
        println("[$name] Memutar lagu $song dari Spotify.")
    }
}