interface Autenticavel {

    //podemos indicar uma variavel ou constante de quem implementa a interface
    val senha: Int

//    fun autentica(senha: Int): Boolean {
//        if(this.senha == senha){
//            return true
//        }
//        return false
//    }

    fun autentica(senha: Int): Boolean

}