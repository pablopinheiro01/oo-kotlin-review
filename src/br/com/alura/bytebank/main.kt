package br.com.alura.bytebank

import br.com.alura.bytebank.teste.testaNullable

fun main() {

//    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasses()


    val minhaFuncaoLambda: () -> Unit = {
        println("Executa como lambda")
    }

    println("Sem execucao $minhaFuncaoLambda")
    println("Com execucao ${minhaFuncaoLambda()}")


    //nao da para reutilizar a logica da funcao anonima ou lambda
    //elas ficam vinculadas a variavel
    val minhaFuncaoAnonima: () -> Unit = fun () {
        println("executa como anonima")
    }

    println("Sem execucao $minhaFuncaoAnonima")

    println("Com execucao ${minhaFuncaoAnonima()}")



}

fun testaTipoFuncaoClasses() {
    val minhaFuncaoClasse: () -> Unit = Teste()

    //UTILIZANDO O minhaFuncaoClasse com os parenteses () eu executo o invoke.
    println(minhaFuncaoClasse())
}

fun testaTipoFuncaoReferencia() {
    //tipo funcao
    //todo tipo de funcao exige um retorno
    //tipo funcao a gente tambem assume que podemos usar uma variavel para fazer uma execução
    //tipo funcao e como se fosse uma interface
    var minhaFuncao: () -> Unit = ::teste

    println(minhaFuncao())
}

fun teste(){ }

//classe sendo executada como tipo Função
class Teste : () -> Unit {
    override fun invoke() {
        println("Executa invoke do teste")
    }

}
