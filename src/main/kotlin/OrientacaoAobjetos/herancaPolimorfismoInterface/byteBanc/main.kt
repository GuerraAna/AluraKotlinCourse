package OrientacaoAobjetos.herancaPolimorfismoInterface.byteBanc

fun main() {
    println("ByteBanc")

    val contaCorrente = ContaCorrente(
        titular = "marcos",
        numero  = 12333
    )

    val contaPoupanca = ContaPoupanca(
        titular = "marcos",
        numero  = 123321
    )

    contaCorrente.saque(valor = 100.0)
    contaCorrente.deposito(valor = 200.0)
}
