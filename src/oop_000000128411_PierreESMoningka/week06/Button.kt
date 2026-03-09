package oop_000000128411_PierreESMoningka.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!)
    }
}