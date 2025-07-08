package com.example.mykotlin

fun main(){
    val oneplus = Oneplus("smartphone")
    oneplus.display()
    println(oneplus.toString())

}
open class Mobiles(val type:String){
    open val name: String = " "
    open val size:Int = 5
    fun makeCall() = println("calling from mobile")
    fun powerOff() = println("Stutting down")
    open fun display() = println("simple mobile display")
}

class Oneplus(typeParam:String): Mobiles(typeParam)
{
    override val name:String = "Ome plus"
    override fun display() {
        super.display()
        println("one plus display")
    }

    override fun toString(): String {
        return "Name -$name - Size-$size"
    }
    }


