package OrientacaoAobjetos.herancaPolimorfismoInterface.basica

class Perfil(
    var nome: String = ""
) {
    var conta: Double = 0.0
        private set

    //métodos bancários.
    fun deposito(valor: Double) {
        if (valor > 0) {
            conta += valor
        }
    }
    fun saque(valor: Double) {
        if (conta >= valor) {
            conta -= valor
        }
    }
    fun transacao(valor: Double, destino: Perfil) {
        if (conta >= valor) {
            conta -= valor
            destino.deposito(valor)
        }
    }
}