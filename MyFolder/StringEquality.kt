package com.example.kotlinbasic2

fun main(){
    val str1 ="Hello"
    val str2 ="Hello"
    val str3="HelloWorld"

    println("comparision(value):${str1==str2}")
    println("comparision(reference:${str1===str2}")
    println("== with str3: ${str1 == str3}")       // true
    println("=== with str3${str1 === str3}")
}