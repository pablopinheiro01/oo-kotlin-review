package br.com.alura.bytebank.modelo

class ContaSalario(

    numero: Int,
    saldo: Double,
    titular: Cliente
): Conta(titular, numero) {

//    override fun deposita(valor: Double) {
//        this.saldo += valor
//    }

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }

}