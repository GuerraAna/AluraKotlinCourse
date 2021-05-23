package OrientacaoAobjetos.primeirosPassos.kotlinPOO

// Códigos que seguem POO
fun main() {
    println("Byte Bank Casa")
    val nomeFelipe = ContaBancaria()
    val nomeAna = ContaBancaria()
    nomeAna.titular = "Ana Guerra POO"
        println(nomeAna.titular)
    nomeAna.conta =  2123
        println(nomeAna.conta)
    nomeAna.saldo = 2000.0

        // Saldo atual:
            println("Saldo da conta de Ana.")
            println(nomeAna.saldo)

        // Depósito:
            println("Depósito na conta da Ana.")
        nomeAna.depositar(20.0)
            println(nomeAna.saldo)

        // Saque:
            println("Saque da conta da Ana.")
        nomeAna.sacar(10.0)
            println(nomeAna.saldo)

        // Transferir:
            println("Transferir dinheiro de Ana para Felipe.")
        nomeAna.transferir(400.0, nomeFelipe)
            println()

    nomeFelipe.titular = "Felipe Guerra POO"
        println(nomeFelipe.titular)
    nomeFelipe.conta =  2124
        println(nomeFelipe.conta)
    nomeFelipe.saldo = 1000.0

    // Saldo atual:
        println("Saldo da conta de Felipe.")
        println(nomeFelipe.saldo)

    // Depósito:
        println("Depósito na conta da Felipe.")
    nomeFelipe.depositar(30.0)
        println(nomeFelipe.saldo)

    // Saque:
        println("Saque da conta da Felipe.")
    nomeFelipe.sacar(10.0)
        println(nomeFelipe.saldo)

    // Transferir:
        println("Transferência da conta de Felipe para Ana.")
    nomeFelipe.transferir(200.0, nomeAna)
        println(nomeFelipe.saldo)
}

class ContaBancaria {
    var titular:  String = ""
    var conta: Int = 0
    var saldo: Double = 0.0

    fun sacar(valor: Double) {
        if(saldo >= valor) {
            saldo -= valor
        }
    }
    fun depositar(valor: Double) {
        saldo += valor
    }
    fun transferir(valor: Double, destino: ContaBancaria): Boolean {
        if(saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
            return false
    }
}