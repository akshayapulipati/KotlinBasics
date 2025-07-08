package com.example.mykotlin

fun main(){
    val result =add(4,  5)
    println(result)
    val result2 =add(5,  5)
    println(result2)
    evenOrOdd(2)
    evenOrOdd(13)

}
fun add(num1: Int, num2: Int): Int{
    val sum =num1 + num2
    return sum
}
//inline function
fun evenOrOdd(num1:Int){
    val result=if(num1 %2== 0) "Even" else "odd"
println(result)}