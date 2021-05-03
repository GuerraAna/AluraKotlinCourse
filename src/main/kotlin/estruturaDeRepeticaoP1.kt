fun main() {
    var saldo: Double = 2.0
}

fun testaCondicoes(saldo: Double) {
    if(saldo > 0.0) {
        println("O saldo será positivo.")
    }else if (saldo == 0.0) {
        println("O saldo será nulo.")
    }else {
        println("O saldo será negativo.")
    }
}