package com.example.mykotlin

fun main() {
    val name: String = "Bunny"
    var nickname: String? = null
    println("Name: $name")
    println("Nickname length: ${nickname?.length}")
    val displayName = nickname ?: "No Nickname"
    println("Display Name: $displayName")
    nickname = "Lucky"
    nickname?.let {
        println("Nickname in uppercase: ${it.uppercase()}")
    }
    println("Nickname length using !!: ${nickname!!.length}")
}
