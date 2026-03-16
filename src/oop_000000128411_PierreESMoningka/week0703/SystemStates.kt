package oop_000000128411_PierreESMoningka.week0703

import oop_000000128411_PierreESMoningka.week0702.DataUser

enum class AppState {
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}