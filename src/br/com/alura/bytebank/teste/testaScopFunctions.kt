package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaScopFunctions() {
    var endereco = Endereco(logradouro = "Rua Vergueiro", numero = 3185)
    val enderecoMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    println(enderecoMaiusculo)

    Endereco(logradouro = "Rua Vergueiro", numero = 3185)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    }.let{ //podemos retornar explicitamente no codigo
//        enderecoEmMaiusculo ->
//        println(enderecoEmMaiusculo)
            //ou podemos referenciar o retorno de uma forma mais resumida
        }.let(::println)

    Endereco(logradouro = "Rua Vergueiro", numero = 3185)
        //utilizando apply é um receiver que utiliza o this no seu proprio contexto sem a necessidade de referenciar por fora...
        .apply {
            "aplly ${logradouro}, ${numero}".toUpperCase()
        }.let(::println)

    Endereco(logradouro = "Rua Vergueiro", numero = 3185)
        //run devolve o valor
        .run {
            "run ${logradouro}, ${numero}".toUpperCase()
        }.let(::println)

    var endTeste = Endereco(logradouro = "Rua Vergueiro", numero = 3185)

    //with nao extende o objeto como o let e o run
    with(endTeste) {
        //a ideia do with e um objeto que a ideia e trabalhar com os seus membros e devolver algo ou nao devolver nada
        println(endTeste)
    }


    var enderecosComComplemento =
        listOf(Endereco(logradouro = "Rua Vergueiro", numero = 3185), Endereco(), Endereco(complemento = "Casa"))
            .filter { endereco -> endereco.complemento.isNotEmpty() }

    println(enderecosComComplemento)

    listOf(Endereco(logradouro = "Rua Vergueiro", numero = 3185), Endereco(), Endereco(complemento = "Casa"))
        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = ::println)
}
