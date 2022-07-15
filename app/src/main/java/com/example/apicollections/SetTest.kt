package com.example.apicollections

fun main() {
    val joao = Funcionario(nome="Joao Zatar", salario=4500.50, "CLT")
    val matilda = Funcionario(nome="Matilda Hart", salario=7800.50,"PJ")
    val carol = Funcionario(nome="Carol Vegi", salario=6700.50,"CLT")
    val marcia = Funcionario(nome="Marcia Sanseverino", salario=3500.70, "PJ")

    val funcionarios1 = setOf(matilda, carol)
    val funcionarios2 = setOf(marcia, joao)
    funcionarios1.forEach { println(it) }
    println("Funcionarios1 ************************")

    funcionarios2.forEach { println(it) }
    println("Funcionarios2 ************************")

    val resultadoUniao = funcionarios1.union(funcionarios2)
    resultadoUniao.forEach{println(it.nome)}
    println("União de listas ************************")

    val funcionarios3 = setOf(marcia, joao, carol)
    funcionarios3.forEach { println(it) }
    println("Funcionarios3 ************************")

    val resultadoSubstracao = funcionarios3.subtract(funcionarios1)
    resultadoSubstracao.forEach { print(it) }
    println("Substracão funcionario2 a 3 ************************")
    println("************************")

    val resultadoIntercecao = funcionarios3.intersect(funcionarios1)
    resultadoIntercecao.forEach { println(it) }
    println("Interceção entre listas funcionario 1 e 3************************")
}