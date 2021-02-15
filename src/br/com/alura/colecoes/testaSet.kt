package br.com.alura.colecoes

fun testaSet() {
    var assistiramCursoAndroid: List<String> = listOf<String>("joao", "calors", "maria")

    var assistiramCursoDeKotlin = listOf("fernando", "marta", "ana", "maria", "carlos")


    val assistiramAmbos = mutableListOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoDeKotlin)

//    println(assistiramAmbos)

    val assistiramAmbosSomando: List<String> = assistiramCursoAndroid + assistiramCursoDeKotlin

    //distinct elimina valores iguais na lista
//    println(assistiramAmbos.distinct())


    var assistiramCursoDeKotlinSet: Set<String> = setOf("fernando", "marta", "ana", "maria", "carlos")
    var assistiramCursoAndroidSet: Set<String> = setOf<String>("joao", "carlos", "maria")
    val assistiramAmbosSomandoSet: Set<String> = assistiramCursoDeKotlinSet + assistiramCursoAndroidSet

//    println(assistiramAmbosSomandoSet)

    val assistiramAmbosSomandoMutableSet: MutableSet<String> = mutableSetOf()
    assistiramAmbosSomandoMutableSet.addAll(assistiramCursoAndroidSet)
    assistiramAmbosSomandoMutableSet.addAll(assistiramCursoDeKotlinSet)
    assistiramAmbosSomandoMutableSet.add("Ricardo Gabriel")
//    println(assistiramAmbosSomandoMutableSet)


    println(assistiramCursoAndroidSet.union(assistiramCursoDeKotlin))
    //a funcao union utiliza o infix que permite utilizar dessa forma infix
    println(assistiramCursoAndroidSet union assistiramCursoDeKotlin)

    println(assistiramCursoAndroidSet.subtract(assistiramCursoDeKotlin))
    //a funcao subtract utiliza o infix que permite utilizar dessa forma infix
    println(assistiramCursoAndroidSet subtract assistiramCursoDeKotlin)
    //ou subtract podemos usar o operador menos
    println(assistiramCursoAndroidSet - assistiramCursoDeKotlin)

    //verifica quem esta nos dois conjuntos
    println(assistiramCursoAndroidSet intersect assistiramCursoDeKotlin)

    var assistiramList: MutableList<String> = assistiramCursoAndroid.toMutableList()
    assistiramList.add("joao")
    println(assistiramList)
    //transforma para set removendo os valores iguais
    println(assistiramList.toSet())
}
