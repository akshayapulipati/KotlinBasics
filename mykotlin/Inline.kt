package com.example.mykotlin

fun main() {
    calculateTimeAndRun {
        loop(100000)
    }
}
inline fun calculateTimeAndRun(fn: () -> Unit) {
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time taken ${end - start} ms")
}

fun loop(n: Long) {
    for (i in 1..n) {
    }
}
