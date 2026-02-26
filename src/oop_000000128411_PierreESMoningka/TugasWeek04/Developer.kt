package oop_000000128411_PierreESMoningka.TugasWeek04

class Developer(
    name: String,
    baseSalary: Int,
    val programmingLanguage: String
) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }

    // calculateBonus() tidak dioverride
    // Developer menggunakan bonus standar dari Employee (10%)
}