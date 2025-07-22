package com.example.kotlinbasic2

fun main(){
    val fruits = mutableListOf("Apple","Banana")
    fruits.add("orange")
    fruits.remove("Banana")
    fruits[0] = "Mango"

    println(fruits)

    val colors = mutableSetOf("Red","Green")
    colors.add("Blue")
    println(colors)
    val colors1= hashSetOf("Whilte","Blue")
    colors1.add("pink")
    println(colors1)

    val students = mutableMapOf(1 to "Akshaya", 2 to "ranjith")
     students[3] = "Latha"
    students[2] ="Lucky"
    println(students)

    val hashMap = hashMapOf(1 to "Asha", 2 to "Ravi")

    hashMap[3] = "Meena"     
    hashMap[2] = "Raj"
    hashMap.remove(1)

    println(hashMap)
}