package br.com.alura.bytebank.modelo

class Endereco(
    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var complemento: String = ""
){
    override fun toString(): String {
        //utilizamos rowstring que vai imprimir exatamente oq escolhemos e a forma como pulamos as linhas
        return """
            Endereco
            (
            logradouro='$logradouro',
             numero=$numero, 
             bairro='$bairro',
              cidade='$cidade',
               estado='$estado',
                cep='$cep',
                 complemento='$complemento
                 ')""".trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Endereco

        if (logradouro != other.logradouro) return false
        if (numero != other.numero) return false
        if (bairro != other.bairro) return false
        if (cidade != other.cidade) return false
        if (estado != other.estado) return false
        if (cep != other.cep) return false
        if (complemento != other.complemento) return false

        return true
    }

    override fun hashCode(): Int {
        var result = logradouro.hashCode()
        result = 31 * result + numero
        result = 31 * result + bairro.hashCode()
        result = 31 * result + cidade.hashCode()
        result = 31 * result + estado.hashCode()
        result = 31 * result + cep.hashCode()
        result = 31 * result + complemento.hashCode()
        return result
    }

    //essa foi minha implementacao
//    override fun equals(other: Any?): Boolean {
//        if (other != null && other is Endereco){
//            this.logradouro == other.logradouro
//            return true
//        }
//        return false
//    }
//
//    override fun hashCode(): Int {
//
//        return logradouro.hashCode()
//    }




}