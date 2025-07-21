package com.example.kotlinbasics1

fun main(){
    var lang = arrayOf("Kotlin","Java","C","C++")
    lang[1] ="java"
    println(lang[1])
    println(lang.size)
    for(i in lang){
        println(i)
    }

    if("Kotlin" in lang){
        println("yes")
    }
}