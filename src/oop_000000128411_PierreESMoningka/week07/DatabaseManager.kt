package oop_000000128411_PierreESMoningka.week07

object DatabaseManager {
    var connetionStatus: String = "Disconnected"

    fun connect() {
        connetionStatus = "Connected to Server"
        println("Database is ready.")
    }
}