package com.example.kotlinbasics1

fun main() {
    outerLoop@ for (i in 1..5) {
        for (j in 1..4) {
            println("akshaya")
            if (j == 2) {
                break@outerLoop

            }
        }
    }
}