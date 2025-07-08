package com.example.mykotlin

fun main() {
    val p1 = Persons("akshaya", 21)
    println(p1.age)
    p1.age = 23
    p1.age = -12
    println(p1.name)
}

class Persons(nameParam: String, ageParam: Int) {
    var name: String = nameParam
        get() {
            println("name getter called")
            return field.uppercase()
        }
    var age: Int = ageParam
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("age cannot be negative")
            }
        }
}
