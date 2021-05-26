package OrientacaoAobjetos.herancaPolimorfismoInterface.byteBanc

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
    ): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
    ) {
    override fun bonificacao(): Double {
        return salario * 2.0
    }
    fun autenticar(senha: Int): Boolean {
        return this.senha == senha
    }
}