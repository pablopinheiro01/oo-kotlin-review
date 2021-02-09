abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {
    //funcao convertida para utilizar uma property
    //essa alteracao esta proxima ao que o kotlin usa
    abstract fun bonificacao(): Double

    abstract val corDoCracha: String

}