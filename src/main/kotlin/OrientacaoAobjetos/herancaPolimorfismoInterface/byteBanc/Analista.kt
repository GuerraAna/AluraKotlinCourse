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
        return salario * 1.5
    }
}