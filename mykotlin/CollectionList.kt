package com.example.mykotlin

fun main(){
    val nums= mutableListOf(1,2,3)
    println(nums.indexOf(3))
    println(nums.contains(4))
    nums[1]=2
    nums.add(5)
    nums.remove(1)
    println(nums)

    val list2= listOf(11,12)
    nums.addAll(list2)
    println(nums)
}