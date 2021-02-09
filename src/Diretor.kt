class Diretor(
     nome: String,
     cpf: String,
     salario: Double,
     senha: Int,
     val PLR: Double
): FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha = senha){

    override fun bonificacao(): Double {
        return salario * 10 + PLR
    }

    override val corDoCracha: String
        get() = "PRETO"

}