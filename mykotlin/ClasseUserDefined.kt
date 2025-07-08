package com.example.mykotlin

fun main() {
    var i: Int = 20
    println(i.plus(30))
    println(i.toFloat())

    val p1 = Person("A", 19)
    val p2 = Person("S", 17)
    println(p1.canVote())
    println(p2.canVote())
}

class Person(val name: String, val age: Int) {
    fun canVote(): Boolean {
        return age > 18
    }
}
