package br.com.alura.colecoes


fun testaCopia() {
    val banco = BancoDeNomes()
    //copia feita por referencia
    val nomesSalvos = banco.nomes as MutableCollection<String>
    banco.salva("Joao")
}

class BancoDeNomes(
){

    val nomes: Collection<String> get() = Companion.dados.toList()

    fun salva(nome: String){
        Companion.dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaFuncao() {
    val nomes: Iterable<String> = listOf(
        "joao",
        "carlitos",
        "frangolino",
        "tarantino",
        "joana dark",
        "carolina",
        "fernandita",
        "joanita",
        "iza",
        "Bruna"
    )

    val nomes2: Iterable<String> = setOf(
        "joao",
        "carlitos",
        "frangolino",
        "tarantino",
        "joana dark",
        "carolina",
        "fernandita",
        "joanita",
        "iza",
        "Bruna"
    )

    for (nome in nomes) {
        println(nome)
    }
    for (nome in nomes2) {
        println(nome)
    }

    println(nomes2.contains("carolina"));

    println(nomes.equals(nomes2))


    val nomes3: MutableList<String> = mutableListOf(
        "joao",
        "carlitos",
        "frangolino",
        "tarantino",
        "joana dark",
        "carolina",
        "fernandita",
        "joanita",
        "iza",
        "Bruna"
    )

    nomes3.add("Vera")
}