

fun main(){

    var idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()
    println("Maior idade: ${maiorIdade}")

    println("menor idade: ${idades.minOrNull()}")

    val media = idades.average()

    println("media das idades: ${media}")

    var todosMaiores = idades.all { it > 18 }
    println(todosMaiores)

    var existeMaior = idades.any() { it >= 18 }
    println("Algum aluno é maior de idade: ${existeMaior}")

    var maioresDeIdade = idades.filter { it >= 18 }
    println("Maiores de idade ${maioresDeIdade}")

    var procuraAlguem = idades.find() { it == 18 }
    println(procuraAlguem)
}