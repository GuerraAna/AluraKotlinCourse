package kotlinPOO

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
        depositar(cadastroAna, 20.0)
        println(cadastroAna.saldoCadastro)
}

class Cadastro {
    var nome: String = ""
    var numero: Int = 0
    var saldoCadastro: Double = 0.0
}

fun depositar(cadastro: Cadastro, valor: Double){
    cadastro.saldoCadastro += valor

}