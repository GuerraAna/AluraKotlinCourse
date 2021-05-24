package OrientacaoAobjetos.herancaPolimorfismoInterface.byteBanc

class Gerente(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: Int
    ) {
    fun bonificacaoG(): Double {
        return salario * 2.0
    }
    fun autenticar(senha: Int): Boolean {
        return this.senha == senha
    }
}