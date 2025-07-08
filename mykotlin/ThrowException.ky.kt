package com.example.mykotlin

fun main(){
    createUserList(5)
    createUserList(-2)
}

fun createUserList(count: Int){
    if (count<0){
        //exception raise
        throw IllegalArgumentException("count must be gretaer than 0")
    }
    else{
        println("user list created contain $count users")
    }
}
