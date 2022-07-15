package com.example.apicollections

fun main() {
    val pair: Pair<String, Double> = Pair("Emiliano", 7800.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
    println("Mapa 1********************")

    val map2 = mapOf("Marilda" to 5400.7,
        "Junior" to 3800.2,
        "Tabata" to 6900.15)
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v")  }
    println("Mapa 2********************")
}