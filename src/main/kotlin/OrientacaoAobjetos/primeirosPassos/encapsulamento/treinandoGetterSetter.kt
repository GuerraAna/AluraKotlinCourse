package OrientacaoAobjetos.primeirosPassos.encapsulamento

fun main() {
    val primeiraPessoa = Alguem()
    primeiraPessoa.nome = "Maria Carla"
        println(primeiraPessoa.nome)
    primeiraPessoa.setSaldo(90203.0)
        println(primeiraPessoa.getSaldo())
        println()

    primeiraPessoa.depositar(2500.0)
        println(primeiraPessoa.getSaldo())
    primeiraPessoa.sacar(180.9)
        println(primeiraPessoa.getSaldo())
        println()

    val segundaPessoa = Alguem()
    segundaPessoa.nome = "Pedro Lucas"
        println(segundaPessoa.nome)
    segundaPessoa.setSaldo(100302.0)
        println(segundaPessoa.getSaldo())
        println()

    segundaPessoa.depositar(3850.0)
        println(segundaPessoa.getSaldo())
    segundaPessoa.sacar(1480.0)
        println(segundaPessoa.getSaldo())
    segundaPessoa.transferencia(200.0, primeiraPessoa)
        println(segundaPessoa.getSaldo())
}

class Alguem() {
    var nome: String = ""
    private var saldo: Double = 0.0

    fun depositar(valor: Double) {
            saldo += valor
    }
    fun sacar(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }
    fun transferencia(valor: Double, destino: Alguem){
        if (saldo >= valor) {
            saldo -= valor
            destino.depositar(valor)
        }
    }
    fun getSaldo(): Double {
        return saldo
    }
    fun setSaldo(valor: Double) {
        saldo = valor
    }
}