package list

fun main(){

    listaDeLivrosComNulos.imprimeComMarcadoresListaNula()

    listaDeLivrosComNulos
        .filterNotNull()
        .groupBy { it.editora }
        .forEach(){ (editora, livros) ->
            println("nome da editora: ${editora}")
            println("Titulo do livro: ${livros}")

            println("$editora: ${livros.joinToString { it.titulo }}")
        }

    // ?: elvis operator, parece um emotion do elvis, no caso ai se for nulo eu sempre retorno um valor default para nulo
    listaDeLivrosComNulos
        .filterNotNull()
        .groupBy { it.editora ?: "Editora Desconhecida"}
        .forEach{ (editora: String, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }


}
