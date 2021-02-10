package br.com.alura.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Any){

        //aqui funciona pq o funcionario aponta para a mesma referencia de funcionarioNovo
        val funcionarioNovo: Funcionario = funcionario as Funcionario
        this.total += funcionario.bonificacao
    }

    fun registraUsandoSmartCast(funcionario: Any){
        funcionario as Funcionario //smart cast
        this.total += funcionario.bonificacao
    }

    fun registraComIs(funcionario: Any){
        if(funcionario is Funcionario){ //Smart Cast, o Is ja faz o As implicitamente e faz a verificacao
            this.total += funcionario.bonificacao
        }
    }

}