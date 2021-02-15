package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaHigherOrderFunctions


fun main() {


    testaHigherOrderFunctions()



}

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal: Double = taxaAnual / 12

    println("Taxa mensal $taxaMensal")

    Cliente(nome = "Joao", cpf = "111.111.111-11", senha = 1234)
        .let { clienteNovo: Cliente ->
            ContaPoupanca(clienteNovo, 1000)
        }.run {
            deposita(1000.0)
            //saldo foi acessado diretamente do objeto retornando no let.
            saldo * taxaMensal
        }.let { rendimentoMensal ->
            println(rendimentoMensal)
        }


    val contaPoupanca = ContaPoupanca(Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1234), 1000)

    contaPoupanca.run{
        deposita(1000.0)
        saldo * taxaMensal
    }.let{
        rendimentoMensal: Double ->
        println("rendimento mensal: $rendimentoMensal")
    }

    val rendimentoAnual = run {
        var saldo: Double = contaPoupanca.saldo
        repeat(12) { indice ->
            saldo += saldo * taxaMensal
        }
        saldo
    }

    println("Simulação rendimento anual $rendimentoAnual")
}

fun testaWith() {
    //pega o endereco, coloca as informações e devolve completo como se fosse uma string
    with(Endereco()) {
        logradouro = "Rua vergueiro"
        numero = 3185
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "065450-000"
        complemento = "Sala Comercial"
        completo()
    }.let { enderecoCompleto: String -> println(enderecoCompleto) }
}



