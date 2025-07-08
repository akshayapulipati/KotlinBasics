package com.example.mykotlin

fun main(){
    val mustang = Car("mustang", "petrol",100)
    val swift = Car("swift","diesel",200)
    println(mustang.name)
    println(mustang.type)
    println(swift.name)
    mustang.driveCar()
    swift.driveCar()

}
class Car(val name: String, val type: String, var kmRan:Int)//properties
{
    fun driveCar(){//methods
        println("${name}car is driving")
    }
    fun applyBreaks(){
        println("breaks applied")
    }
}