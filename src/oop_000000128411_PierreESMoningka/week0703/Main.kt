package oop_000000128411_PierreESMoningka.week0703

fun main() {
    println("\n=== TEST SEALED ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    // ERROR: 'when expression must be exhaustive
    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
    }
}