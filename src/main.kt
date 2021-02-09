fun main() {

    val cliente = Cliente(nome = "joao", cpf="123564789", senha = 1234)

    val sistema = SistemaInterno()
    sistema.entra(cliente, 1234)

}



