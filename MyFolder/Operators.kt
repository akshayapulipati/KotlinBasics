package com.example.kotlinbasics1

fun main(){
    //Arithmetic
    var x: Float = 13.0F
    var y: Int = 2
    println(x+y)
    println(x-y)
    println(x*y)
    println(x/y)
    println(x%y)
//Assignment
    var z:Int = 5
    z+= 3
    z-= 2
    z *=2
    z /= 2
    z %= 2
    println(z)

    //relational
    var a: Int = 20
    var b: Int = 10
    println(a==b)
    println(a>b)
    println(a>=b)
    println(a<b)
    println(a<=b)
    println(a!=b)

    //logical
    var mark: Int = 65
    var age: Int =22
    var exam = mark < 67 && age<23
    var exam1 = mark < 67 || age<23
    println("Result is"+exam)
    println("Result is"+exam1)

    //unary
    var u = 5
    println("u = $u")
    println("++u = ${++u}") // Pre-increment
    println("--u = ${--u}") // Pre-decrement
}

