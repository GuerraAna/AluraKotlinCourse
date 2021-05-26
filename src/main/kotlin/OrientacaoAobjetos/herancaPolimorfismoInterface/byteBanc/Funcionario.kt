package OrientacaoAobjetos.herancaPolimorfismoInterface.byteBanc

abstract open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    ) {
    abstract open fun bonificacao(): Double
}