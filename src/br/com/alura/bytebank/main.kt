package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun main() {

    var endereco = Endereco(logradouro = "Rua Vergueiro", numero = 3185)
    val enderecoMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    println(enderecoMaiusculo)

    Endereco(logradouro = "Rua Vergueiro", numero = 3185)
        .let{endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    }.let{ //podemos retornar explicitamente no codigo
//        enderecoEmMaiusculo ->
//        println(enderecoEmMaiusculo)
            //ou podemos referenciar o retorno de uma forma mais resumida
        }.let(::println)

    var enderecosComComplemento =
        listOf(Endereco(logradouro = "Rua Vergueiro", numero = 3185), Endereco(), Endereco(complemento = "Casa"))
            .filter { endereco -> endereco.complemento.isNotEmpty() }

    println(enderecosComComplemento)

    listOf(Endereco(logradouro = "Rua Vergueiro", numero = 3185), Endereco(), Endereco(complemento = "Casa"))
        .filter(predicate ={ endereco -> endereco.complemento.isNotEmpty()})
        .let(block = ::println)

    //higher order function, quando temos uma funcao que recebe ou devolve outra funcao
    //nao e muito utilizado, mas e possivel
    //o mais comum é uma funcao que recebe outra
    Endereco().let{

    }

    soma(1,5){
        println(it)
    }

    soma(2,9, resultado = (::println))

    var autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("Realizar o pagamento")
    })

}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit){
    println("antes da soma")
    //preciso executar o resultado
    resultado(a+b)
    println("Depois da soma")

}