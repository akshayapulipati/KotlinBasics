package com.example.mykotlin

fun main(){
    var car=Automobile("Car",4,5,true)
//    var person=Person("A",20)
//    println(person.age)
//    println(person.name)

}
class Automobile(val name: String, val type:Int, val maxSeating:Int,hasAirBags: Boolean){
    init {
        println("$name is crated")
    }
    var airBags = hasAirBags//custom property assignment
    fun drive(){}
    fun applyBrakes(){}
}
//empty constructor
//class Empty{}
//
//class Person(nameParam:String,ageParam:Int){
//    val name:String="$nameParam -Clan"
//    val age:Int=ageParam
//    var canVote:Boolean =ageParam >18
//}