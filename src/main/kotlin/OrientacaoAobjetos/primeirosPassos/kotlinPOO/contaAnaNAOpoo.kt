package OrientacaoAobjetos.primeirosPassos.kotlinPOO

fun main() {
    val cadastroAna = Cadastro()
    cadastroAna.nome = "Ana Guerra"
        println(cadastroAna.nome)
    cadastroAna.numero = 27
        println(cadastroAna.numero)
    cadastroAna.saldoCadastro = 200.0
        println(cadastroAna.saldoCadastro)

        // Deposito na conta de Ana.
            println("Deposito na conda da Ana.")
        cadastroAna.depositar(20.0)
            println(cadastroAna.saldoCadastro)

        // Saque da conta de Ana.
            println("Saque da conta de Ana.")
        cadastroAna.sacar(10.0)
            println(cadastroAna.saldoCadastro)
}

class Cadastro {
    var nome: String = ""
    var numero: Int = 0
    var saldoCadastro: Double = 0.0

    fun depositar(valor: Double){
        saldoCadastro += valor
    }
    fun sacar(valor: Double){
        saldoCadastro -= valor
    }
}