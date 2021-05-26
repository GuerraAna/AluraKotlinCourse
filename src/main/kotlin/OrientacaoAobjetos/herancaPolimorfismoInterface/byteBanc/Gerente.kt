package OrientacaoAobjetos.herancaPolimorfismoInterface.byteBanc

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
    ): FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = 5311
), Autenticavel {
    override fun bonificacao(): Double {
        return salario * 2.0
    }
    fun autenticar(senha: Int): Boolean {
        return this.senha == senha
    }
}