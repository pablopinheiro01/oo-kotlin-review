package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {

    //higher order function, quando temos uma funcao que recebe ou devolve outra funcao
    //nao e muito utilizado, mas e possivel
    //o mais comum é uma funcao que recebe outra
    Endereco().let{

    }

    "".let(::testeRecebeString)

    1.let{
        it
    }

    teste(1,{})

    val testeFuncao: () -> Unit
    Endereco().let {
        it
    }

}

fun testeRecebeString(valor: String){}

fun teste(teste: Int, bloco: () -> Unit) {}

