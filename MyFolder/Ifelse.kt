package com.example.kotlinbasics1

fun main() {
    /*

   if(condtion)
  {
  //run code when con is true
  }else{
  //run code when con is false
  }
     */

    
    var Kotlin: Boolean = true
    var cse: Boolean = true
    if(Kotlin && cse){
        println("U are eligible for interview")
    } else {
        println("u are no eligible")
    }



    var skill: String = "Kotlin"
    var degree: String = "cse"

    if (skill.equals("Kotlin") && degree.equals("cse")) {
        println("U are eligible for interview")
    } else {
        println("u are no eligible")
    }

    var a: Int =20
    var b: Int = 10
    var result = if (a>b) "$a is gretaer than $b" else if(a==b)"$a is equal to b" else "$b is bigger tha $a"
    println(result)
}