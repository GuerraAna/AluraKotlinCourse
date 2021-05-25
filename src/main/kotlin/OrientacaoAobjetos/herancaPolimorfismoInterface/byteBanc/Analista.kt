package OrientacaoAobjetos.herancaPolimorfismoInterface.byteBanc

class Analista(
    nome: String,
    cpf: String,
    salario: Double
    ): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
    ) {
    override fun bonificacao(): Double {
        return super.bonificacao() * 1.5
    }
}