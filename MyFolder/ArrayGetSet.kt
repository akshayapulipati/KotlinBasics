package com.example.kotlinbasic2

fun main() {
    fun main() {
      val fruits = arrayOf("Apple","Banana","Mango","Cherry")
      //accessing using get
      println(fruits.get(0))
      //modifying using set
      println(fruits.set(1,"Berry"))

      println(fruits.get(1))
    }

    val numbers = arrayOf(10, 20, 30, 40, 50)

    // Traversing using index range
    for (i in 0..numbers.lastIndex) {//create range from 0 to last index
        println("Index $i = ${numbers[i]}")
    }

}