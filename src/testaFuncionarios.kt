fun testaFuncionarios() {
    val pablo: Funcionario = Analista(nome = "Pablo", cpf = "321.123.321-22", salario = 13600.0)
    println("nome ${pablo.nome}")
    println("cpf ${pablo.cpf}")
    println("salario ${pablo.salario}")
    println("Bonificacao do meninao ${pablo.bonificacao()}")

    val fran: Gerente = Gerente(nome = "fran", cpf = "321.123.321-22", salario = 50000.0, senha = 1234)
    println("nome ${fran.nome}")
    println("salario ${fran.salario}")
    println("Bonificacao ${fran.bonificacao()}")

    if (fran.autentica(1234)) {
        println("autenticou ok")
    } else {
        println("nom foi nao")
    }

    val gattes: Diretor =
        Diretor(nome = "gattes", cpf = "321.123.321-22", salario = 90000.0, PLR = 98999.21, senha = 4321)

    println("nome ${gattes.nome}")
    println("salario ${gattes.salario}")
    println("Bonificacao ${gattes.bonificacao()}")
    println("PLR ${gattes.PLR}")

    val calc = CalculadoraBonificacao()
    calc.registra(gattes)
    calc.registra(fran)
    calc.registra(pablo)

    val maria: Analista = Analista(nome = "maria", cpf = "321.123.321-22", salario = 6900.0)
    calc.registra(maria)

    println("total de bonificacao dog: ${calc.total}")
}