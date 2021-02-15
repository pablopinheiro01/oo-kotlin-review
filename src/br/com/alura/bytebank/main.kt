package br.com.alura.bytebank

fun main() {

    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasses()

//
//    val minhaFuncaoLambda: () -> Unit = {
//        println("Executa como lambda")
//    }
//
//    println("Sem execucao $minhaFuncaoLambda")
//    println("Com execucao ${minhaFuncaoLambda()}")
//
//
//    //nao da para reutilizar a logica da funcao anonima ou lambda
//    //elas ficam vinculadas a variavel
//    val minhaFuncaoAnonima: () -> Unit = fun () {
//        println("executa como anonima")
//    }
//
//    println("Sem execucao $minhaFuncaoAnonima")
//
//    println("Com execucao ${minhaFuncaoAnonima()}")



}

fun testaTipoFuncaoClasses() {
    //fiz a instancia da classe, nao preciso enviar nenhum parametro nersse momento
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()

    //quando vamos executar o codigo vamos passar o parametro
    //UTILIZANDO O minhaFuncaoClasse com os parenteses () eu executo o invoke.
    println(minhaFuncaoClasse(10,10))
}

fun testaTipoFuncaoReferencia() {
    //tipo funcao
    //todo tipo de funcao exige um retorno
    //tipo funcao a gente tambem assume que podemos usar uma variavel para fazer uma execução
    //tipo funcao e como se fosse uma interface
    var minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5,10))
}

fun soma(a: Int, b: Int): Int{
    return a + b
}

//classe sendo executada como tipo Função
class Soma : (Int, Int) -> Int {

    override fun invoke(a: Int, b: Int): Int = a + b

}
