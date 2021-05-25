package OrientacaoAobjetos.herancaPolimorfismoInterface.byteBanc

class Diretor(
    nome: String,
    salario: Double,
    cpf: String,
    val senha: Int,
    val plr: Double
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
    ) {
    override fun bonificacao(): Double {
        return super.bonificacao()* 3.0 + plr
    }
    fun autenticar(senha: Int): Boolean {
        return this.senha == senha
    }
}