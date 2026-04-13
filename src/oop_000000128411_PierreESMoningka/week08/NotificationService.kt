package oop_000000128411_PierreESMoningka.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        // send Email(user.email) // INI AKAN ERROR: Type mismatch

        if (user.email != null) {
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}