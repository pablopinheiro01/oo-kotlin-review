package br.com.alura.bytebank.exception

class FalhaDeAutenticacaoException(var mensagem: String = "Filhote ta sem permissao...")
    : Exception(mensagem){

}