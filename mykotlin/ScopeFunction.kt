package com.example.mykotlin

fun main() {
    val emp: Employee = Employee()
    emp.age = 20
    emp.name = "john"

    emp.let {
        it.age = 20
        it.name = "john"

    }
    with(emp) {
        age = 30
        name = "ccc"

    }

    emp.run {
        age = 22
        name ="mmm"
    }
}
data class Employee(
    var name:String="",
    var age:Int = 0
)