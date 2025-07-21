package com.example.kotlinbasics1

fun main(){
myPyramid()
}
fun myPyramid() {
    println("Pyramid")
    var n = 5
    for (i in 0 until 5) {
        for (j in 0 until n - 1) {
            print(" ")
        }
        for(k in 0 until i){
            print("*")
        }
        println("")
    }
}
