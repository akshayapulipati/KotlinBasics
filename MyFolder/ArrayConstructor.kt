package com.example.kotlinbasic2

fun main() {
    //  an array of size 5, where each element is the square of its index
    val squares = Array(5) { index -> index * index }

    println("squares of index 0 to 4:")

    // Traverse and print the array
    for (i in squares.indices) {
        println("Index $i: ${squares[i]}")
    }
}
