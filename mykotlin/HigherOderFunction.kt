package com.example.mykotlin

fun main() {
    var fn: (a: Double, b: Double) -> Double = ::sum
    println(fn(2.0, 3.0))
    calculator(5.0, 4.0, ::sum)
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun calculator(a: Double, b: Double, gn: (Double, Double) -> Double) {
    val result = gn(a, b)
    println(result)
}
