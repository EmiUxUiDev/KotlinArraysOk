package com.example.apicollections

fun main() {
    val joao = Funcionario(nome="Joao Zatar", salario=4500.50, "CLT")
    val matilda = Funcionario(nome="Matilda Hart", salario=7800.50,"PJ")
    val carol = Funcionario(nome="Carol Vegi", salario=6700.50,"CLT")
    val marcia = Funcionario(nome="Marcia Sanseverino", salario=3500.70, "PJ")
    val funcionarios = listOf(joao, matilda, carol, marcia)

    funcionarios.forEach{ println(it)}
    println("********************************")
    println(funcionarios.find { it.nome == "Carol Vegi" })
    println("********************************")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }
    println("********************************")
    funcionarios.groupBy { it.tipoContratacao  }.forEach {println(it)}
}


