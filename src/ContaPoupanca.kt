class ContaPoupanca(
    titular: String,
    numero: Int
): ContaComum(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.2
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }

}