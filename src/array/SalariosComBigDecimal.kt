import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

   val salarios = Array<BigDecimal>(5){ BigDecimal.ZERO }
    salarios[0] = "1500.55".toBigDecimal()
    salarios[1] = "2500.0".toBigDecimal()
    salarios[2] = "3500.0".toBigDecimal()
    salarios[3] = "4500.0".toBigDecimal()
    salarios[4] = "5500.0".toBigDecimal()

    println(salarios.contentToString())

    var salariosBigDecimalList = bigDecimalArrayOf("3500.0","10000.0","3900.0","1000.0")

    val aumento = "1.1".toBigDecimal()

    var salariosBigDecimalComAumento: Array<BigDecimal> = salariosBigDecimalList.map {
            salario -> calculaAumentoRelativo(salario, aumento)
    }.toTypedArray()

    println("Salarios com aumento ficou: ${salariosBigDecimalComAumento.contentToString()}")

    intArrayOf(1,2,3).sum()

    var gastoInicial = salariosBigDecimalComAumento.somatorioa()
    println("Gasto inicial ${gastoInicial}")

    val meses = 6

    val gastoTotal = salariosBigDecimalComAumento.fold(gastoInicial){
        acumulador, salario -> acumulador + (salario + meses.toBigDecimal()).setScale(2, RoundingMode.UP)
    }

    println("GAsto total com salario da galera ${gastoTotal}")

    //retorna uma lista ordenada do menor para o maior
    var salariosOrdenados = salariosBigDecimalComAumento.sorted()

    //pega os tres ultimos elementos
    val tresUltimosSalarios: Array<BigDecimal> = salariosOrdenados.takeLast(3).toTypedArray()

    val media = tresUltimosSalarios.media()
    val mediaSimplificada = salariosBigDecimalComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println("Media dos tres ultimos salarios: ${mediaSimplificada}")

    val mediaTresPrimeirosSalarios = salariosBigDecimalComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()

    println("Media dos tres menores salarios: ${mediaTresPrimeirosSalarios}")




}

private fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumento: BigDecimal
) = if (salario < "5000.0".toBigDecimal()) {
    salario + "500".toBigDecimal()
} else {
    (salario * aumento).setScale(2, RoundingMode.UP)
}

