package OrientacaoAobjetos.herancaPolimorfismoInterface.byteBanc

open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    ) {
    open fun bonificacao(): Double {
        return salario * 1.0
    }
}