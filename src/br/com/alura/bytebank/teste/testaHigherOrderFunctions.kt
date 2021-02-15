package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaHigherOrderFunctions() {
    //higher order function, quando temos uma funcao que recebe ou devolve outra funcao
    //nao e muito utilizado, mas e possivel
    //o mais comum é uma funcao que recebe outra
    Endereco().let {

    }

    soma(1, 5) {
        println(it)
    }

    somaReceiver(1,5, resultado = {
        println(this)
    } )

    soma(2, 9, resultado = (::println))

    var autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("Realizar o pagamento")
    })

    val sistema = SistemaInterno()

    sistema.entraReceiver(autenticavel, 1234, autenticado = {
        pagamento()
    })

}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit){
    println("antes da soma")
    //preciso executar o resultado
    resultado(a+b)
    println("Depois da soma")

}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit){
    println("antes da soma")
    //preciso executar o resultado
    // poderiamos devolver: resultado(a+b) ou ...
    var total = a + b
    total.resultado()
    println("Depois da soma")
}