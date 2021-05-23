package OrientacaoAobjetos.primeirosPassos.construtor

fun main() {
    //Primeira Pessoa.
    val nome = Perfil("Pedro Henrique", 90213.0)

    //Adquire conteúdo da class Perfil.
    println(nome.nome)
    println(nome.conta)
    println()

    //Realiza métodos da class Perfil.
    nome.deposito(1030.0)
    println(nome.conta)
    nome.saque(200.0)
    println(nome.conta)
    println()

    //Segunda Pessoa.
    val segundoNome = Perfil("Mariana Andrade", 10293.0)

    //Adquire conteúdo da class Perfil.
    println(segundoNome.nome)
    println(segundoNome.conta)

    //Realiza métodos da class perfil.
    segundoNome.deposito(9012.0)
    println(segundoNome.conta)
    segundoNome.saque(30.0)
    println(segundoNome.conta)
    segundoNome.transacao(123.0, nome)
    println(segundoNome.conta)
}

class Perfil(var nome: String, var conta: Double) {

    //métodos bancários.
    fun deposito(valor: Double) {
        if (valor > 0) {
            conta += valor
        }
    }
    fun saque(valor: Double) {
        if (conta >= valor) {
            conta -= valor
        }
    }
    fun transacao(valor: Double, destino: Perfil) {
        if (conta >= valor) {
            conta -= valor
            destino.deposito(valor)
        }
    }
}