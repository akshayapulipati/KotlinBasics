package com.example.mykotlin

fun main(){
    var arr: Array<String> = arrayOf("one", "Two" , "Threee")
    var arr1: Array<Int> = arrayOf(1,2,3)
    var arr2 = arrayOf<Int>(3,4,4)
    for((i ,e)in arr.withIndex()){
        println("$i = $e")
    }
    println(arr[0])
    println(arr.get(1))
    arr.set(0,"hello")
    println(arr[0])
    println(arr.size)
}