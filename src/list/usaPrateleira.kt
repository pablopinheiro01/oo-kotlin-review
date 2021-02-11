package list

fun main(){

    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    println("Retornamos o objeto: ${porAutor.hashCode()}")
    porAutor.imprimeComMarcadores() //estamos apontando para o mesmo objeto por este motivo a lista ira repetir a sua ordem
    println("Retornamos o objeto: ${porAnoPublicacao.hashCode()}")
    porAnoPublicacao.imprimeComMarcadores() //devido o sortby chamado ambas as listas estao sendo modificadas da mesma forma


    /*
    A função sortBy reorganiza os elementos da coleção que a invocou
    de acordo com um critério, enquanto a função sortedBy cria uma nova
    coleção ordenada de acordo com um critério, poupando a lista original.
     */

}