package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

public fun testaAny() {
    println(fazAlgumaCoisa(texto = "Oi"))
    println(fazAlgumaCoisa(texto = 10))
    println(fazAlgumaCoisa(texto = 10.5))


    imprime(15)
    imprime("texto")
    imprime(false)

    val endereco = Endereco()

    imprime(endereco)
    imprime(Any())

    val teste: Any = imprime(endereco)
    println(teste)

    val enderecoPrimario = Endereco(logradouro = "Rua total", cep = "123456", cidade = "Franco Da Rocha")
    val enderecoSecundario = Endereco(logradouro = "Rua total", cep = "123456", cidade = "Franco Da Rocha")

    println(enderecoPrimario.equals(enderecoSecundario))
    println(enderecoPrimario.hashCode())
    println(enderecoSecundario.hashCode())
}

fun fazAlgumaCoisa(texto: Any): Any {
    return texto
}

fun imprime(valor: Any) : Any{
    println(valor)
    return valor
}

