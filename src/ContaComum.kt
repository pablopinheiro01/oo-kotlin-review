abstract class ContaComum(
    var titular: String,
    val numero: Int
) : Conta{
    var saldo = 0.0
        protected set //quem nao estiver no escopo da classe abstrata nao pode alterar a propriedade

    override fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

//    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: ContaComum): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}