package OrientacaoAobjetos.herancaPolimorfismoInterface.byteBanc

import OrientacaoAobjetos.herancaPolimorfismoInterface.basica.Perfil

abstract class ContaPrincipal(
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