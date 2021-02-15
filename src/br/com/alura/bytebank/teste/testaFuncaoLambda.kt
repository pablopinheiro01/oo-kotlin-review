package br.com.alura.bytebank.teste

fun testaFuncaoLambda() {
    val minhaFuncaoLambadaComInferencia = { a: Int, b: Int -> a + b }

    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            //@Lambda vai ser uma referencia que possibilita retornos diferentes
            return@lambda salario + 50
            //o return se for usado ele sempre vai se referencia a instrução que esta acima, no caso da main que é unit dessa situação
        }
        //sempre retorna a ultima instrução
        return@lambda salario + 100.0
    }

    val minhaFuncaoLambda: (Int, Int) -> Int = {
        //defino os parametros que serao inseridos como o A e o B declarado
            a, b ->
        // quando definimos dessa forma indicamos que nao vamos utilizar =
        // _ , _

        //aqui eu defino a operacao e a expressao lambada ja compreende que esse e o retorno
        //a expressao lambda devolve sempre a ultima referencia executada
        a + b
    }
    println("Sem execucao $minhaFuncaoLambda")
    println("Com execucao ${minhaFuncaoLambda(20, 10)}")
    println(calculaBonificacao(1500.0))
}
