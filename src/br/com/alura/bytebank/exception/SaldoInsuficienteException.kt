package br.com.alura.bytebank.exception

class SaldoInsuficienteException(var mensagem: String = " Saldo insuficiente ")
    : Exception(mensagem){

}