package oop_000000128411_PierreESMoningka.week07

import javax.xml.crypto.Data

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connetionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}