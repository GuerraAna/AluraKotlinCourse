package kotlinPOO

// Códigos que seguem POO
fun main() {
    val nome = ContaBancaria()
    nome.titular = "Ana Guerra POO"

    nome.conta =  2123

    nome.saldo = 2000.0
        println("Depósito na conta da Ana.")

        // Depósito:
        nome.depositar(20.0)
        println(nome.saldo)

        // Saque:
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