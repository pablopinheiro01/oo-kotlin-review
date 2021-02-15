package br.com.alura.bytebank.teste

fun testaFuncaoAnonima() {
    //nao da para reutilizar a logica da funcao anonima ou lambda
    //elas ficam vinculadas a variavel
    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("executa como anonima")
    }

    //funcao anonima devemos considerar quando deixar bem claro os parametros e o retorno e o escopo da execução do codigo
    val minhaFuncaoAnonimaComRetorno: (Int, Int) -> Int = fun(a, b): Int {
        println("executa como anonima")
        //tenho que declarar o que eu quero retornar
        return a + b
    }
    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50
        }
        return salario + 100.0
    }

    println(calculaBonificacaoAnonima(1500.0))

    println("Sem execucao $minhaFuncaoAnonima")

    println("Com execucao ${minhaFuncaoAnonima()}")
    println("Com execucao ${minhaFuncaoAnonimaComRetorno(5, 20)}")
}
