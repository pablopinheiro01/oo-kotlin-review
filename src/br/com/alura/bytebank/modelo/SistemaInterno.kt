package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {} ){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }


}