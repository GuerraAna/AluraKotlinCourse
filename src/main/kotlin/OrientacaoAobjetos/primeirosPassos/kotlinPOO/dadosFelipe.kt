package OrientacaoAobjetos.primeirosPassos.kotlinPOO

fun main() {
    val menino = Dados()
    menino.nome = "Felipe Guerra"
        println(menino.nome)
    menino.idade = 12
        println(menino.idade)
    menino.carteira = 20.0

        // Dinheiro atual do menino.
            println("O menino tem na carteira ${menino.carteira} reais.")
            println(menino.carteira)

        // O menino ganha dinheiro.
            println("A mãe do menino de mais 50 reais para ele.")
        menino.maisDinheiro(50.0)
            println(menino.carteira)

        // O menino emprestou o dinheiro à mãe.
            println("A mãe do menino pegou 10 reais emprestado dele.")
        menino.menosDinheito(10.0)
            println(menino.carteira)
}
class Dados{
    var nome: String = ""
    var idade: Int = 0
    var carteira: Double = 0.0

    fun maisDinheiro(real: Double) {
        this.carteira += real
    }
    fun menosDinheito(dinheiro: Double) {
        this.carteira -= dinheiro
    }
}

