class Auxiliar(
     nome: String,
     cpf: String,
     salario: Double,
): Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun bonificacao(): Double {
        TODO("Not yet implemented")
    }

    override val corDoCracha: String
        get() = "AMARELO"


}