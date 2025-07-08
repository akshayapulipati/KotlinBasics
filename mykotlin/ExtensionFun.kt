package com.example.mykotlin

fun main(){
    println("Hello world.f".formattedString())
}
fun String.formattedString():String{
    return "-----------------\n$this\n--------"
}