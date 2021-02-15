package br.com.alura.colecoes


fun testaComportamentosMap() {
    val pedidosSimple = mapOf<Int, Double>(
        1 to 25.0,
        2 to 36.0,
        4 to 65.12,
        5 to 12.32,
        6 to 280.0
    )

    println(pedidosSimple.get(6))

    var orElse = pedidosSimple.getOrElse(6, {
        "Não tem o pedido o campo ta sem nada tio"
    })

    //deixa o default como -1 para os pedidos nao existentes, ou entao eu poderia inserir qualquer outro valor
    var orDefault = pedidosSimple.getOrDefault(6, -1.0)
    println(orDefault)

//    println(pedidos.keys)

    for (numero in pedidosSimple.keys) {
        println("Pedido de numero $numero")
    }

    //filter utiliza um pair, referencia que vai manter a chave e o valor de cada elemento do mapa
    var pedidosFiltroados = pedidosSimple.filter { (numero, valor) -> numero % 2 == 0 && valor > 50.0 }
    println("Os pedidos filtrados são: ${pedidosFiltroados}")

    var pedidosAcimaDe = pedidosSimple.filterValues { valor -> valor > 70.0 }

    var pedidosPares = pedidosSimple.filterKeys { numero -> numero % 2 == 0 }

    println("Os pedidos acima de 70 sao: $pedidosAcimaDe")
    println("Os pedidos pares são: $pedidosPares")

    println(pedidosSimple + Pair(7, 90.0))
    println(pedidosSimple + mapOf(7 to 90.0, 8 to 90.0))
    println(pedidosSimple)
    println(pedidosSimple - 6)
    println(pedidosSimple)

    //plusAssign e minusAssign - altera o array literalmente e nao devolve um novo


    println(pedidosSimple + mapOf(7 to 90.0, 8 to 20.0))
    println(pedidosSimple)

    println(pedidosSimple - listOf(6, 5))
    println(pedidosSimple)

    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 100.0,
        6 to 80.0
    )

//    pedidos.putAll(listOf<Pair<Int,Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0))
    pedidos += listOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0)
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    pedidos -= 6
    println(pedidos)
}

fun testaMap() {
    mapOf<Int, Double>(Pair(1, 20.0), Pair(2, 39.0))
    //infix utilizado o TO para ligar a chave ao valor equivale ao Pair
    // ################ ATENCAO #####################
    //se for algum map que envolva performance nao utilize o ifix e sim o Pair, algo importante
    mapOf<Int, Double>(1 to 25.0, 2 to 36.0, 4 to 65.12, 5 to 12.32)

    val pedidos = mapOf<Int, Double>(1 to 25.0, 2 to 36.0, 4 to 65.12, 5 to 12.32)


    pedidos?.let {
//        println("Pedido ${it}")
    }

//    println("Pedido a partir do get ${pedidos.get(2)}, ou ${pedidos[1]}")

    for (pedido: Map.Entry<Int, Double> in pedidos) {
//        println("numero do pedido: ${pedido.key}")
//        println("valor do pedido: ${pedido.value}")
    }

    val pedidosMutable = mutableMapOf<Int, Double>(
        1 to 25.0,
        2 to 36.0,
        4 to 65.12,
        5 to 12.32
    )

    pedidosMutable[6] = 70.0
    println(pedidosMutable)
    // insere e modifica
    pedidosMutable.put(5, 80.0)
    println(pedidosMutable)

    //verifica se ja existe e adiciona
    pedidosMutable.putIfAbsent(8, 600.0)
    println(pedidosMutable)
    //remove um elemento dado chave
    pedidosMutable.remove(8)
    println(pedidosMutable)
    //remove se o elemento na posicao tiver o valor declarado
    pedidosMutable.remove(3, 20.0)
}
