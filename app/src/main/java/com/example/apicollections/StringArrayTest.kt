package com.example.apicollections

fun main() {
    val nomes = Array<String>(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Xeomar"
    nomes[2] = "Clidia"

    for(nome in nomes){
        println(nome)
    }
    println("Array String iterado com for************")
    nomes.sort()
    for(nome in nomes){
        println(nome)
    }
    println("Array String e ordenado com sort************")

    val nomes2 = arrayOf("Maria", "Zacarias", "Pedro", "Angelica", "Gustavo")

    nomes2.forEach {
        println(it)
    }
    println("Array String 2************")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
    println("Array String 2 ordenado************")
}