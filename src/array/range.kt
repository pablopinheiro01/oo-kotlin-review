

fun main(){

    val serie: IntRange = 1.rangeTo(10)
    for(s in serie){
        println("$s")
    }

    val numerosPares = 1..100 step 2
    for(s in numerosPares){
        println(s)
    }

    val numeroParesReverso = 100 downTo 0 step 2
    numeroParesReverso.forEach(){
        println("$it")
    }

    val intervalo = 1500.0..5000.0
    val salario = 4000.0

    if(salario in intervalo){
        println("Esta dentro do intervalo ${salario}")
    }else{
        println("N esta dentro do intervalo ${salario}")
    }

    var intervalorDoAlfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in intervalorDoAlfabeto)
}