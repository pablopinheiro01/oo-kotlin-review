package br.com.alura.colecoes

fun main(){

    //comportamento de transformação visa devolver uma nova coleção através de uma operação a partir de um elemento criado
    val pedidos = listOf<Pedido>(
        Pedido(1, 20.0),
        Pedido(2, 30.0),
        Pedido(3, 40.0),
        Pedido(4, 70.0),
        Pedido(5, 10.0)

    )


//    var pedidosMapeados = pedidos.associate { pedido: Pedido -> Pair(pedido.numero, pedido) }
//    var pedidosMapeados = pedidos.associate { pedido: Pedido -> pedido.numero to pedido }
    //devolve o proprio valor que esta sendo percorrido durante a iteração
    var pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }
    println("Pedidos mapeados: $pedidosMapeados")

    val pedidosFreteGratis = pedidos.associateWith { pedido -> pedido.valor > 50.0 }
    println("Pedidos com o frete gratis: ${pedidosFreteGratis}")
    println("Pedido filtrado: ${pedidosFreteGratis[Pedido(numero=2,valor = 30.0)]}")

    println("Pedido filtrado: " +
            "${pedidosFreteGratis[Pedido(numero=2,valor = 30.0)]}" +
            "")

    val mapa = pedidos.associateBy { pedido -> pedido.valor > 50.0 }
    println(mapa)

    //agrupamento

    var pedidosFreteGratisAgrupado: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFreteGratisAgrupado)

    var listaAgenda = listOf("Alex", "Fran", "ana", "maria", "mario", "gisele", "fernando")

    //AGRUPA VALORES ASSOCIANDO A UMA CHAVE
    var agenda = listaAgenda.groupBy { nome -> nome.first() }
    println(agenda)
    println(agenda['A'])
}

data class Pedido(val numero: Int, val valor:Double)

