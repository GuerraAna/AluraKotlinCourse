package OrientacaoAobjetos.primeirosPassos.properties

fun main() {
    //Primeira Pessoa.
    val nome = Perfil()

    //Adquire conteúdo da class Perfil.
    nome.nome = "Pedro Henrique"
        println(nome.nome)
    nome.deposito(90213.0)
        println(nome.conta)
        println()

    //Realiza métodos da class Perfil.
    nome.deposito(1030.0)
        println(nome.conta)
    nome.saque(200.0)
        println(nome.conta)
        println()

    //Segunda Pessoa.
    val segundoNome = Perfil()

    //Adquire conteúdo da class Perfil.
    segundoNome.nome = "Mariana Andrade"
        println(segundoNome.nome)
    segundoNome.deposito(10293.0)
        println(segundoNome.conta)

    //Realiza métodos da class perfil.
    segundoNome.deposito(9012.0)
        println(segundoNome.conta)
    segundoNome.saque(30.0)
        println(segundoNome.conta)
    segundoNome.transacao(123.0, nome)
        println(segundoNome.conta)
}

class Perfil {
    //Estrutura Perfil.
    var nome: String = ""
    var conta: Double = 0.0
        private set


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