package com.example.mykotlin

sealed class ApiResponse
data class Success(val data: String) : ApiResponse()
data class Failure(val error: String) : ApiResponse()
object Loading : ApiResponse()
object Empty : ApiResponse()


fun handleResponse(response: ApiResponse) {
    when (response) {
        is Success -> println(" Success: ${response.data}")
        is Failure -> println(" Error: ${response.error}")
        is Loading -> println(" Loading, please wait...")
        is Empty -> println(" No data available")
    }
}

fun main() {
    val response1: ApiResponse = Success("User profile loaded successfully.")
    val response2: ApiResponse = Failure("Unable to reach the server.")
    val response3: ApiResponse = Loading
    val response4: ApiResponse = Empty

    handleResponse(response1)
    handleResponse(response2)
    handleResponse(response3)
    handleResponse(response4)
}
