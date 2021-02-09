fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(titular = "Carlos", numero = 1234)
    val contaPoupanca = ContaPoupanca(titular = "Val", numero = 32140000)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo conta corrente: ${contaCorrente.saldo}")
    println("saldo conta poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo conta corrente apos saque: ${contaCorrente.saldo}")
    println("saldo conta poupanca apos saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo conta corrente apos transferir: ${contaCorrente.saldo}")
    println("saldo conta poupanca apos apos receber transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("saldo conta corrente apos receber transferencia: ${contaCorrente.saldo}")
    println("saldo conta poupanca apos transferir : ${contaPoupanca.saldo}")
}
