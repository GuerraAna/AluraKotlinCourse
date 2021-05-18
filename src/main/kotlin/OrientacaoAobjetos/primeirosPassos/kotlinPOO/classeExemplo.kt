package OrientacaoAobjetos.primeirosPassos.kotlinPOO

fun main() {
    val primeiraPessoa = Pessoa()
    primeiraPessoa.titular = "Maria Clara"
        println(primeiraPessoa.titular)
    primeiraPessoa.numero = 1912
        println(primeiraPessoa.numero)
    primeiraPessoa.saldo = 245.50
        println(primeiraPessoa.saldo)
        println()
        println("Primeira pessoa métodos em sua própria conta:")
    primeiraPessoa.depositar(500.0)
        println(primeiraPessoa.saldo)
    primeiraPessoa.sacar(100.0)
        println(primeiraPessoa.saldo)
        println()

    val segundaPessoa = Pessoa()
    segundaPessoa.titular = "Pedro Henrique"
        println(segundaPessoa.titular)
    segundaPessoa.numero = 1994
        println(segundaPessoa.numero)
    segundaPessoa.saldo = 431.90
        println(segundaPessoa.saldo)
        println()
        println("Segunda Pessoa métodos em sua própria conta:")
    segundaPessoa.depositar(50.0)
        println(segundaPessoa.saldo)
    segundaPessoa.sacar(10.0)
        println(segundaPessoa.saldo)
        println()
        println("Depósito da segunda pessoa para a primeira pessoa:")
    segundaPessoa.transferencia(100.0, primeiraPessoa)
        println(segundaPessoa.saldo)
}

class Pessoa() {
    var titular: String = ""
    var numero: Int = 0
    var saldo:Double = 0.0

    fun depositar(valor: Double) {
            saldo += valor
    }
    fun sacar(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }
    fun transferencia(valor: Double, destino: Pessoa): Boolean {
        if (saldo >= valor) {
            //Conta origin:
            saldo -= valor
            //Conta Destino:
            destino.saldo += valor
            return true
        } else {
            return false
        }
    }
}