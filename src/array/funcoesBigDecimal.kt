import java.math.BigDecimal

//varargs do kotlin recebe varios elementos independente do tamanho
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    return Array<BigDecimal>(valores.size){ i -> valores[i].toBigDecimal() }
}
//extension function
fun Array<BigDecimal>.somatorioa(): BigDecimal {
    //this referencia o array de bigdecimal
    return this.reduce(){acumulador, valor ->
        //itera cada item do array
        acumulador + valor
    }
}

fun Array<BigDecimal>.media(): BigDecimal{
    return if (this.isEmpty()){
        BigDecimal.ZERO
    }else{
        return this.somatorioa() / this.size.toBigDecimal()
    }
}