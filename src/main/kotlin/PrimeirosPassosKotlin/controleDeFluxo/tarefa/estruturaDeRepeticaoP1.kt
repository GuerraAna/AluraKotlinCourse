package PrimeirosPassosKotlin

fun main() {
    val saldo: Double = 2.0
    testaCondicoes1(saldo)
}

fun testaCondicoes1(saldo: Double) {
    if(saldo > 0.0) {
        println("O saldo será positivo.")
    }else if (saldo == 0.0) {
        println("O saldo será nulo.")
    }else {
        println("O saldo será negativo.")
    }
}