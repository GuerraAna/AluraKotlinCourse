package OrientacaoAobjetos.herancaPolimorfismoInterface.byteBanc

class Diretor(
    nome: String,
    salario: Double,
    cpf: String,
    senha: Int,
    val plr: Double
): FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = 3451
    ), Autenticavel {
    override fun bonificacao(): Double {
        return salario * 3.0 + plr
    }
}