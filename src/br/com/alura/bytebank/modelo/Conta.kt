package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaDeAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numero: Int
): Autenticavel {
    var saldo = 0.0
        protected set

    companion object { //object declaration, permite que seja alterado somente pela classe q ele é membro
        var total = 0
            private set
    }

    init {
        println("Criando conta")
        total++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException( mensagem = "Saldo atual filho $saldo, valor a ser subtraido $valor ")
        }

        if(!autentica(senha)){
            throw FalhaDeAutenticacaoException()
        }


    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}