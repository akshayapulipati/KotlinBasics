package com.example.mykotlin

fun main(){
    val arr= arrayOf(1,2,3)
    try{
        println(arr[5])
    }
    catch (ex:NullPointerException){

    }
    catch (e: Exception){
        println("pplease chech the arrrya index")
    }
    finally {
        println("it will execute no matter what")
    }
}