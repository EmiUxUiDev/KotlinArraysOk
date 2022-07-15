package com.example.apicollections

fun main() {
    val salarios = doubleArrayOf(1750.20, 2540.20, 2824.10, 1800.50, 4500.0, 3710.80)

    for(item in salarios){
        println(item)
    }
    println("*************************")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media dos salarios: ${salarios.average()}")

    val salariosMaiorQue2000 = salarios.filter {it >= 1750.20 }
    salariosMaiorQue2000.forEach { println("Salario >= 1750.20: $it") }

    println("*************************")

    println("A quantidade de salarios entre 2000 e 3200 são:" +
            " ${salarios.count { it in 2000.0..3200.0}}")

    println("*************************")

    println("Encontrar salario igual a 2824.10 ---> ${salarios.find { it == 2824.10 }}")
    println("Encontrar salario igual a 3000.00 ---> ${salarios.find { it == 3000.00 }}")

    println("Encontrar salario igual a 4500.00(ANY) ---> ${salarios.any { it == 4500.00 }}")
    println("Encontrar salario igual a 1500.00(ANY) ---> ${salarios.any { it == 1500.00 }}")
}