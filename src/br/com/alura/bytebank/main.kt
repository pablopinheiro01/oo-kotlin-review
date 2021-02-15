package br.com.alura.bytebank

fun main() {
//
//    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasses()


    val minhaFuncaoLambda: (Int, Int) -> Int = {
            //defino os parametros que serao inseridos como o A e o B declarado
            a,b ->
        // quando definimos dessa forma indicamos que nao vamos utilizar =
        // _ , _

        //aqui eu defino a operacao e a expressao lambada ja compreende que esse e o retorno
        //a expressao lambda devolve sempre a ultima referencia executada
        a + b
    }

    val minhaFuncaoLambadaComInferencia = { a: Int, b: Int -> a + b }

    println("Sem execucao $minhaFuncaoLambda")
    println("Com execucao ${minhaFuncaoLambda(20 , 10)}")


    //nao da para reutilizar a logica da funcao anonima ou lambda
    //elas ficam vinculadas a variavel
    val minhaFuncaoAnonima: () -> Unit = fun () {
        println("executa como anonima")
    }

    //funcao anonima devemos considerar quando deixar bem claro os parametros e o retorno e o escopo da execução do codigo
    val minhaFuncaoAnonimaComRetorno: ( Int, Int) -> Int = fun(a , b) : Int {
        println("executa como anonima")
        //tenho que declarar o que eu quero retornar
        return a + b
    }

    println("Sem execucao $minhaFuncaoAnonima")

    println("Com execucao ${minhaFuncaoAnonima()}")
    println("Com execucao ${minhaFuncaoAnonimaComRetorno(5,20)}")

    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if(salario > 1000.0){
            //@Lambda vai ser uma referencia que possibilita retornos diferentes
            return@lambda salario + 50
            //o return se for usado ele sempre vai se referencia a instrução que esta acima, no caso da main que é unit dessa situação
        }
        //sempre retorna a ultima instrução
        return@lambda salario + 100.0
    }
    println(calculaBonificacao(1500.0))

    val calculaBonificacaoAnonima: (salario:Double) -> Double = fun(salario): Double {
        if(salario > 1000.0){
            return salario + 50
        }
        return salario + 100.0
    }

    println(calculaBonificacaoAnonima(1500.0))

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
