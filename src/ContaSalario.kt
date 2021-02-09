class ContaSalario(
    val titular: String,
    val numero: Int,
    var saldo: Double
): Conta{

    override fun deposita(valor: Double) {
        this.saldo += valor
    }

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }

}