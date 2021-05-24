package OrientacaoAobjetos.herancaPolimorfismoInterface.byteBanc

class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    ) {
    fun bonificacaoF(): Double {
        return salario * 1.0
    }
}