package com.example.apicollections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 2500.0
    salarios[1] = 7800.5
    salarios[2] = 3200.8

    salarios.forEach {
        println(it)
    }
    println("********************************")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.05
    }
    salarios.forEach {
        println(it)
    }
    println("For each indexado, parecido com map JS/array modificado")

    val salarios2 = doubleArrayOf(2500.5, 2700.0, 1820.5, 7800.8)
    salarios2.sort()
    salarios2.forEach {
        println(it)
    }
    println("Double array of, versão aprimorada************")
}