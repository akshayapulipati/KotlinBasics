package com.example.kotlinbasic2

fun main(){
    val escaped = "Hello,\nWelcome to kotlin"
    val raw ="""
        This is one
        this is two this is three
    """.trimIndent()
    println(escaped)
    println(raw)
}