package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("início main")



    println("fim main")
}

public fun tratandoInformacoesNulas() {
    var endereco: Endereco? = null
    //? (safe call operator) <- interrogacao indica que pode ser nulo
    // !! (no null assert operator) <- indica que temos certeza que o objeto nao esta nulo
    endereco!!.logradouro

    val enderecoNaoNulo: Endereco = endereco!!
    enderecoNaoNulo.logradouro
}



