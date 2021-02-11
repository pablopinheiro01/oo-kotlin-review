package list

fun main(){

    val livro1 = Livro(titulo = "Java com JSF 1.0", autor = "Caelum", anoPublicacao = 2011, editora = "Editora Casa do codigo")
    val livro2 = Livro(titulo = "Spring Boot", autor = "AlgaWorks", anoPublicacao = 2020, editora = "Editora Alga+")
    val livro3 = Livro(titulo = "JavaScript Avançado", autor = "Erick Wendel", anoPublicacao = 2021, editora = "Editora B")
    val livro4 = Livro(titulo = "Boas Praticas de Programação OO", autor = "Pablo", anoPublicacao = 2000, editora = "Editora Tkio")

    //Listas  sempre serao objetos
    val livros: MutableList<Livro> = mutableListOf<Livro>(livro1, livro2, livro3, livro4)

    //listas mutaveis aceitam adicionar novos elementos na sua lista
    livros.add(
        Livro(titulo = "Cozinha top", autor = "joao", anoPublicacao = 1777)
    )

    println(livros)

    livros.remove(livro1)

    println(livros)

    livros.imprimeComMarcadores()

    var ordenadoAnoDePublicacao: List<Livro> = livros.sorted()
    println("Ordenando os livros: ${ordenadoAnoDePublicacao.imprimeComMarcadores()}")

    //aqui podemos utilizar um criterio de ordenacao simples assim...
    livros.sortedBy {  it.autor }

    println("LISTA DE LIVROS ORDENADO POR MARCADORES")

    livros.imprimeComMarcadores()

    listaDeLivros
        .filter { it.editora?.startsWith("E")!! }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()

    // .map cria uma lista nova contendo os parametros enviados na funcao
    val titulos: List<String> = listaDeLivros
        .filter { it.titulo.startsWith("O") }
        .sortedBy { it.autor }
        .map{it.titulo}

    println("IMPRIMINDO SOMENTE TITULOS")
    println(titulos)


}
