package com.example.apicollections

fun main() {
    val values = IntArray(5)
    values[0] = 6
    values[1] = 8
    values[2] = 5
    values[3] = 12
    values[4] = 9

    for (item in values){
        println(item)
    }
    println("Com For***************************")
    for (index in values.indices){
        println(values[index])
    }
    println("Com For e indices***************************")

    values.forEach {
        println(it)
    }
    println("Com ForEach***************************")
    values.sort()
    for (item in values){
        println(item)
    }
    println("Com For e Sort***************************")
}