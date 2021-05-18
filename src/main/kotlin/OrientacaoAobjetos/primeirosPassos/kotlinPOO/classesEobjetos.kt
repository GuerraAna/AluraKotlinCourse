package OrientacaoAobjetos.primeirosPassos.kotlinPOO

fun main() {
    // Primeira Pessoa.
    val primeiraPessoa = Conta()
    primeiraPessoa.titular = "Mario Carlos"
        println(primeiraPessoa.titular)
    primeiraPessoa.numero = 202131
        println(primeiraPessoa.numero)
    primeiraPessoa.saldo = 20000.0
        println(primeiraPessoa.saldo)

    // Segunda Pessoa.
    val segundaPessoa = Conta()
    segundaPessoa.titular = "Marcelo Alves"
        println(segundaPessoa.titular)
    segundaPessoa.numero = 201314
        println(segundaPessoa.numero)
    segundaPessoa.saldo = 3021.0
        println(segundaPessoa.saldo)
}

class Conta {
    var titular: String = ""
    var numero: Int = 0
    var saldo: Double = 0.0
}