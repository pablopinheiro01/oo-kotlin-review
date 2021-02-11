package list


fun List<Livro>.imprimeComMarcadores(){
    val joinToString = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }

    println("LISTA DE LIVROS \n${joinToString}")
}

//tratamento com listas nulas
fun List<Livro?>.imprimeComMarcadoresListaNula(){
    val joinToString = this
        //essa funcao equivale ao filterNotNull .filter{ it != null }
        .filterNotNull()
        .joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }

    println("LISTA DE LIVROS \n${joinToString}")
}