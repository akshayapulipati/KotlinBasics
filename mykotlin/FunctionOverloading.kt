package com.example.mykotlin

import kotlin.math.pow
import kotlin.reflect.KFunction2

fun main(){
    var fn: (Double, Double) -> Double = ::addition
    println(fn(2.0,3.0))

    fn =::power
    println(fn(2.0, 3.0))

//    println(addition(1,2))
//    println(addition(1.0,2.0))

}
//fun addition(a: Int, b: Int): Int{
//    return a + b
//}
fun addition(a:Double, b:Double):Double
{
    return a+b
}
fun power (a: Double, b:Double):Double
{
    return a.pow(b)
}