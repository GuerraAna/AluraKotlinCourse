package OrientacaoAobjetos.primeirosPassos.encapsulamento


// Utilizando o Getter e o Setter
fun main() {
    val nome = Pessoa()
    nome.nome = "Ana Guerra"
    //nome.conta = 2050.0
    //O objeto pessoa recebeu como valor os objetos da classe Pessoa.
    //Note que o objeto conta está privado e por isso é criado os métodos set e get.
    //O método set, captura uma cópia do objeto conta e inseri um valor aqui no objeto nome.
    nome.setConta(2050.0)

        //Note que aqui foi utilizado o get para pegar os dados atualizados na classe Pessoa, após a inserção se um valor em set.
        println(nome.nome)
        println(nome.getConta())
        println()

    nome.deposita(123.0)
        println(nome.getConta())
    nome.saca(20.0)
        println(nome.getConta())
        println()


    val segundoNome = Pessoa()
    segundoNome.nome = "Paulo"
    //segundoNome.conta = 9830.0
    segundoNome.setConta(9830.0)

        println(segundoNome.nome)
        println(segundoNome.getConta())
        println()

    segundoNome.deposita(2000000.0)
        println(segundoNome.getConta())
    segundoNome.saca(100.0)
        println(segundoNome.getConta())
    segundoNome.transfere(800.0,nome)
        println(segundoNome.getConta())
}

class Pessoa {
    var nome: String = ""
    //var conta: Double = 0.0
    private var conta: Double = 0.0


    fun deposita(valor: Double) {
        conta += valor
    }

    fun saca(valor: Double) {
        if (conta >= valor) {
            conta -= valor
        }
    }

    fun transfere(valor: Double, destino: Pessoa): Boolean {
        if (conta >= valor) {
            conta -= valor
            destino.deposita(valor)
        }
        return true
    }

    // Cria uma função que PEGA uma cópia da conta.
    fun getConta(): Double {
        return conta
    }

    // Cria uma função que retorna os valores do objeto para a class modificar.
    fun setConta(valor: Double) {
        conta = valor
    }
}
