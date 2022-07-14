package com.example.apicollections

fun main() {
    val values = intArrayOf(5, 8, 9, 15, 2, 89, 1)
    values.forEach {
        println(it)
    }
    println("ArrayOf forEach**************")
    values.sort()
    values.forEach {
        println(it)
    }
    println("ArrayOf forEach and Sort**************")
    
}