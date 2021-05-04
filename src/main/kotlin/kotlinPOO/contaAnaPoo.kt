package kotlinPOO

// Códigos que seguem POO
fun main() {
    val nome = ContaBancaria()
    nome.titular = "Ana Guerra POO"
        println(nome.titular)
    nome.conta =  2123
        println(nome.conta)
    nome.saldo = 2000.0

        // Saldo atual:
            println("Saldo da conta de Ana.")
            println(nome.saldo)

        // Depósito:
            println("Depósito na conta da Ana.")
        nome.depositar(20.0)
            println(nome.saldo)

        // Saque:
            println("Saque da conta da Ana.")
        nome.sacar(10.0)
            println(nome.saldo)

        // Transferir:

}

class ContaBancaria {
    var titular:  String = ""
    var conta: Int = 0
    var saldo: Double = 0.0

    fun sacar(valor: Double) {
        if(this.saldo >= valor) {
            saldo -= valor
        }
    }
    fun depositar(valor: Double) {
        this.saldo += valor
    }
    fun transferir() {

    }
}