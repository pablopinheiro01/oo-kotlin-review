package list

//classe com uma lista imutavel
data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {

    fun organizarPorAutor():List<Livro>{
       return livros.sortedBy { it.autor } //retorna uma nova lista
    }

    fun organizarPorAnoPublicacao(): List<Livro>{
        return livros.sortedBy { it.anoPublicacao } //retorna uma nova lista
    }
}

//classe mutavel conforme o ponteiro aponta para o mesmo objeto pode ser alterado conforme o uso
//data class Prateleira(
//    val genero: String,
//    val livros: MutableList<Livro>
//) {
//
//    fun organizarPorAutor():MutableList<Livro>{
//        livros.sortBy { it.autor }
//        return livros
//    }
//
//    fun organizarPorAnoPublicacao(): MutableList<Livro>{
//        livros.sortBy { it.anoPublicacao }
//        return livros
//    }
