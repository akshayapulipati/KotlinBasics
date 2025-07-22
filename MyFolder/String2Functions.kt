package com.example.kotlinbasic2

fun main(){
    val str =" Kotlin Programming "

    println("Original:$str")
    println("Length:${str.length}")
    println("is empty:${str.isEmpty()}")
    println("is not empty:${str.isNotEmpty()}")
    println("Uppercase:${str.uppercase()}")
    println("lowercase:${str.lowercase()}")
    println("contains:${str.contains("pro")}")
    println("starts with:${str.startsWith(" Kotlin")}")
    println("ends with${str.endsWith("g ")}")
    println("Substring(1, 7): '${str.substring(1, 7)}'")
    println(" Replace 'Kotlin' with 'Java': ${str.replace("Kotlin", "Java")}")
    println(" Trimmed: '${str.trim()}'")


    val csv = "apple,banana,grape"
    val fruits = csv.split(",")
    println("13. Split: $fruits")

    val joined = fruits.joinToString(" | ")
    println("14. Joined: $joined")

    println("15. Compare 'apple' to 'banana': ${"apple".compareTo("banana")}")
    println("    Compare 'apple' to 'apple': ${"apple".compareTo("apple")}")

}