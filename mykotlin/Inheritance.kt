package com.example.mykotlin

fun main() {
    val objChild = Child()
    objChild.myMethod()
    objChild.myMethod2()
}

open class Parent {
    val name: String = "Parent"

    fun myMethod() {
        println("I am parent")
    }
}

class Child : Parent() {
    val name2: String = "Child"

    fun myMethod2() {
        println("I am child")
    }
}
