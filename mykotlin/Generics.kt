package com.example.mykotlin

class Box<T>(private val item: T) {
    fun getItem(): T = item
}

fun main() {
    val intBox = Box(42)
    val strBox = Box("Hello")

    println("Int Box: ${intBox.getItem()}")
    println("String Box: ${strBox.getItem()}")
}
