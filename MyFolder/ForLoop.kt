package com.example.kotlinbasics1

fun main(){
    /*
    * for(item in condition){
    * //body of loop
    * }
    * */
    for(i in 1..5){
        println(i)
    }
    //until for loop
    for(i in 1 until 5){
        println(i)
    }
    println("for loop ended")
    for (i in 5 downTo 1){
        println(i)
    }
    for (i in 10 downTo 1 step 2){
        println(i)
    }


    //iterate string
    val name = "Akshaya"
    for (ch in name) {
        println(ch)
    }
//string
    val fruits = arrayOf("Apple", "Banana", "Cherry")

    for (fruit in fruits) {
        println(fruit)
    }

    // Using index
    for (i in fruits.indices) {
        println("Fruit at $i is ${fruits[i]}")
    }

    //label
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (j == 2) break@outer
            println("i = $i, j = $j")
        }
    }
    //contimulabel
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (j == 2) continue@outer
            println("i = $i, j = $j")
        }
    }
}