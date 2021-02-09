fun testaAutenticacao() {
    println("Bem vindo ao Bytebank")

    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )
    val diretora = Diretor(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        PLR = 200.0
    )

    gerente.autentica(1000)
    diretora.autentica(123)
}
