package com.example.mykotlin

fun main(){
    val students= mutableMapOf<Int,String>()
    students.put(1,"bunny")
    students.put(2,"lucky")
    students.put(3,"chinnu")

    println(students.get(1))
    println(students.get(11))
     for((key,value ) in students){
         println("$key=$value")
     }

    students[8]="john"
    println(students[8])
}