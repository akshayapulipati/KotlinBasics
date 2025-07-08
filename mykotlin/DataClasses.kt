package com.example.mykotlin

//  a data class
data class User(val name: String, val age: Int)

fun main() {
    // two instances with same values
    val user1 = User1("Bunny", 24)
    val user2 = User1("Bunny", 24)

    // toString()
    println("1. toString(): $user1")


    // equals()
    println("2. Equals comparison: ${user1 == user2}")

    // hashCode()
    println("3. HashCode of user1: ${user1.hashCode()}")
    println("   HashCode of user2: ${user2.hashCode()}")

    // copy()
    val user3 = user1.copy(age = 30)
    println("4. Copied user with new age: $user3")


    // componentN() — Destructuring
    val (name, age) = user3
    println("5. Destructured -> Name: $name, Age: $age")
}
