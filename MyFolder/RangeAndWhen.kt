package com.example.kotlinbasics1

fun main(){
    //range in kotlin--> .., until
    var number1=5
    var result1=number1 in 1..5//1,2,3,4,5
    var result2 =number1 in 1 until 5//1,2,3,4

    println(result1)
    println(result2)

    var language ="Kotlin"
    var finalResult=when(language) {
        "java" -> "language is java"
                "Kotlin" -> "language is kotlin"
        else -> "language not found"
    }
    println(finalResult)

    if (language.equals("java")){
        println("language is java")
    }else if(language == "Kotlin"){
        println("lan os Kotlin")
    }else{
        println("not found")
    }
//calculator
    var a =12
    var b = 2
    println("please enter operator +,-,*,/,%")
    var operator = readLine()//readline gives nullable string

    when(operator){
        "+" -> println(a+b)
        "-" -> println(a-b)
        "*" -> println(a*b)
        "/" -> println(a/b)
        "%" -> println(a%b)
        else -> println("operator not found")
    }

}