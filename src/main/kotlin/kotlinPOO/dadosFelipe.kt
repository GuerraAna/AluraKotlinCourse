package kotlinPOO

fun main() {
    val menino = Dados()
    menino.nome = "Felipe Guerra"
        println(menino.nome)
    menino.idade = 12
        println(menino.idade)
    menino.carteira = 20.0
        println("O menino tem na carteira ${menino.carteira} reais.")
        println(menino.carteira)
        // O menino ganha dinheiro.
        println("A mãe do menino de mais 50 reais para ele.")
        maisDinheiro(menino, 50.0)
        println(menino.carteira)
        // O menino emprestou o dinheiro à mãe.
        println("A mãe do menino pegou 10 reais emprestado dele.")
        menosDinheito(menino, 10.0)
        println(menino.carteira)
}
class Dados{
    var nome: String = ""
    var idade: Int = 0
    var carteira: Double = 0.0
}
fun maisDinheiro(nome: Dados, real: Double) {
    nome.carteira += real
}
fun menosDinheito(nome: Dados, dinheiro: Double) {
    nome.carteira -= dinheiro
}
