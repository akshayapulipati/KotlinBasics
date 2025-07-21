package com.example.kotlinbasics1

fun main(){
//break terminates the nearest enclosing loop
    for(i in 1..10){
        println(i)
        if(i == 5){
            break
        }
        println("*****continue loop**")
        for(j in 1..10){

            if(j%2==0){//skips the even and prints odd
                continue
            }
            println(j)
        }

    }
}