package com.example.mykotlin

fun main(){
    calculator(1,2){a,b ->a+b}
    var fn:(a:Int,b:Int) ->Int=::sum
    val lambda1={x:Int,y:Int -> x+y}
    val multiLambda={
        println("hello world")
        val a=2+3
        2
    }
    val singleParameterLambda={x:Int -> x*x}
    val lambda2:(Int) ->Int={x ->x*x}

    println(multiLambda())
}
fun sum(a:Int,b:Int):Int = a+b

fun calculator(a:Int,b:Int,op:(Int,Int) ->Int):Int{
    return op(a,b)
}