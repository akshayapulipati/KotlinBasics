package com.example.kotlinbasic2

fun main(){
    val name ="Akshaya"
    println("my name is $name")
    println("first letter:${name[0]}")
    println("Length:${name.length}")
    println("Is Empty:${name.isEmpty()}")
    println("Is not empty:${name.isNotEmpty()}")


    println("characters in name:")
    for (ch in name)
        println(ch)
}