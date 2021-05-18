package PrimeirosPassosKotlin

fun main() {
    println("Bem vindo ao Bytebank")
    val titular: String = "Ana"
    val numeroConta: Int = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200

    println("Titular $titular")
    println("Número da conta $numeroConta")
    println("Saldo da conta $saldo")

    //Primeiro exemplo (Controle de fluxo if):
    if (saldo > 0.0) {
        println("A conta é positiva.")
    }else if (saldo == 0.0) {
        println("A conta é neutra.")
    }else {
        println("A conta é negativa.")
    }

}