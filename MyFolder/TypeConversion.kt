package com.example.kotlinbasics1

fun main() {
    val ageStr = "25"
    val age = ageStr.toInt()           // Converting String to Int
    val salary = 45000.75
    val salaryStr = salary.toString()  // Converting Double to String

    println("Age: $age, Salary: $salaryStr")
}
