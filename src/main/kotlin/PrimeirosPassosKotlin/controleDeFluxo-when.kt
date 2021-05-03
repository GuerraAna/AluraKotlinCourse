package PrimeirosPassosKotlin

fun main() {
    controleDeFluxo()
}
fun controleDeFluxo(){
    println("Bem vindo ao Bytebank")
    val titular: String = "Ana"
    val numeroConta: Int = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200

    println("Titular $titular")
    println("Número da conta $numeroConta")
    println("Saldo da conta $saldo")

    //Segundo exemplo (Controle de fluxo when):
    when {
        saldo > 0.0 -> {
            println("A conta é positiva.")
        }
        saldo == 0.0 -> {
            println("A conta é neutra.")
        }
        else -> {
            println("A conta é negativa.")
        }
    }
}