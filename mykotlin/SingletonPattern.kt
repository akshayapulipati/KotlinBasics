package com.example.mykotlin

// This is a Singleton
object AppLogger {
    fun logInfo(message: String) {
        println("INFO: $message")
    }

    fun logError(message: String) {
        println("ERROR: $message")
    }
}
fun main() {
    AppLogger.logInfo("App started")
    AppLogger.logError("Something went wrong")
}
