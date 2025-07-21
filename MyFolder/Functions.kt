package com.example.kotlinbasics1

fun main(){
myFunction()//call the fun in main
    var result:Int=add(5,2)//arguments
    println("sum is $result")
}
//user defined
fun myFunction(){
    println("Hello")

}
//parameterised
fun add(num1: Int,num2:Int):Int=num1+num2//iline fun
//{//parameters
//    var sum = num1+num2
//    return sum
