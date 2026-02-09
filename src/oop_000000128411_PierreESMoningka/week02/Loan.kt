class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}

fun main() {
    val loan1 = Loan("Laskar Pelangi", "Andi", 5)
    val loan2 = Loan("Bumi Manusia", "Budi")

    println("Denda ${loan1.borrower}: Rp ${loan1.calculateFine()}")
    println("Denda ${loan2.borrower}: Rp ${loan2.calculateFine()}")
}
