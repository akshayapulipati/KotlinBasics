package com.example.mykotlin

enum class Day(val isWeekend: Boolean) {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    fun activity(): String {
        return if (isWeekend) "Relax and enjoy!" else "Go to work or study!"
    }
}

fun main() {
    // loop through all days
    for (day in Day.values()) {
        println("${day.name}: Weekend? ${day.isWeekend} → ${day.activity()}")
    }

    // access a specific day
    val today = Day.SUNDAY
    println("\nToday is ${today.name}, so: ${today.activity()}")
}
