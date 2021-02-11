
fun main(){
    var salarios: DoubleArray = doubleArrayOf(1500.45, 2300.0, 5600.0, 8000.0, 10000.0)

    val aumento = 1.1

    for(indice in salarios.indices){
        println("Salario sem atualizar ${salarios[indice]}")
        salarios[indice] = salarios[indice] * aumento
        println("Salario atualizado ${salarios[indice]}")
    }

    salarios.forEachIndexed(){
        i, salario ->
        println("Salario sem atualizar ${salarios[i]}")
            salarios[i] = salario * aumento
        println("Salario atualizado ${salarios[i]}")
    }


}