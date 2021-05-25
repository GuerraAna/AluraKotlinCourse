package OrientacaoAobjetos.primeirosPassos.kotlinPOO

import OrientacaoAobjetos.herancaPolimorfismoInterface.basica.Perfil

fun main() {
    // Primeira Pessoa.
    val primeiraPessoa = Conta()
    primeiraPessoa.titular = "Mario Carlos"
        println(primeiraPessoa.titular)
    primeiraPessoa.numero = 202131
        println(primeiraPessoa.numero)
    primeiraPessoa.saldo = 20000.0
        println(primeiraPessoa.saldo)

    // Segunda Pessoa.
    val segundaPessoa = Conta()
    segundaPessoa.titular = "Marcelo Alves"
        println(segundaPessoa.titular)
    segundaPessoa.numero = 201314
        println(segundaPessoa.numero)
    segundaPessoa.saldo = 3021.0
        println(segundaPessoa.saldo)
}

open class Conta(
    var titular: String = "",
    var numero: Int = 0,
    var saldo: Double = 0.0
){
    fun deposito(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }
    open fun saque(valor: Double) {
            if (saldo >= valor) {
            saldo -= valor
            }
    }
    fun transacao(valor: Double, destino: Perfil) {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposito(valor)
        }
    }
}