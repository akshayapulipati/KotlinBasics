package com.example.kotlinbasic2
fun main() {
    val fruits = arrayOf("Apple", "Banana", "Cherry")
//accessing array elements
    println(fruits[0])
    println(fruits[1])
    println(fruits[2])

    //modifying array
    fruits[1] = "Mango"
    println(fruits[1])

    //traversing (loop through)--means going through each element in array one by one
    val numbers = arrayOf(10,20,30,40)
    for(num in numbers)
        println(num)

}

