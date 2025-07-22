package com.example.kotlinbasic2

fun main() {
    val numbers = arrayOf(10, 20, 30, 40, 50)

    println(" for loop:")
    for (num in numbers) {
        println(num)
    }

    println("\n for loop with indices:")
    for (i in numbers.indices) {
        println("Index $i = ${numbers[i]}")
    }

    println("\n forEach function:")
    numbers.forEach { value ->//is the current element of arry being processed
        println(value)//prints that element
    }

    println("\n forEachIndexed function:")
    numbers.forEachIndexed { index, value ->
        println("Index $index = $value")
    }

    println("\n While loop:")
    var i = 0//to manuaally manage an index i
    while (i < numbers.size) {
        println(numbers[i])
        i++
    }

    println("\n Do-While loop:")
    var j = 0
    do {
        println(numbers[j])
        j++
    } while (j < numbers.size)
}
