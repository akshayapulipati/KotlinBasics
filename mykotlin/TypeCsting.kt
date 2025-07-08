package com.example.mykotlin

fun main() {
    val obj1: Any = "Hello Kotlin"
    val obj2: Any = 100
    val obj3: Any = 3.14
    val obj4: Any = true

    // unsafe cast: will succeed
    val str: String = obj1 as String
    println("Unsafe Cast Success: $str")

    // safe cast: returns null if not castable
    val safeCast: String? = obj2 as? String
    println("Safe Cast Result: $safeCast") // Output: null


    checkType(obj1)
    checkType(obj2)
    checkType(obj3)
    checkType(obj4)
}

fun checkType(obj: Any) {
    when (obj) {
        is String -> println("Smart Cast: '$obj' is a String with length ${obj.length}")
        is Int -> println("Smart Cast: $obj is an Int, double = ${obj * 2}")
        is Double -> println("Smart Cast: $obj is a Double, int = ${obj.toInt()}")
        else -> println("Smart Cast: $obj is of unknown type")
    }
}

