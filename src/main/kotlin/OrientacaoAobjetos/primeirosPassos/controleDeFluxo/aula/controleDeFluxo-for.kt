package OrientacaoAobjetos.PrimeirosPassosKotlin

fun main() {
    testaCondicoes()
}

fun testaCondicoes(){
    val saldo: Double = 2.0
    testaCondicoes2(saldo)

    var contador: Int = 0
    for (i in 1..10){
        val frase = "A ana é nota $i"
        val numero = i
        val conta = 100 + i

        println(i)
        println(frase)
        println(numero)
        println(conta)
    }
    println(testaCondicoes2(saldo))
}
fun testaCondicoes2(saldo: Double) {
    if(saldo > 0.0) {
        println("O saldo será positivo.")
    }else if (saldo == 0.0) {
        println("O saldo será nulo.")
    }else {
        println("O saldo será negativo.")
    }
}