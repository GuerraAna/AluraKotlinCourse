package kotlinPOO

fun main() {
    contaGuerra()
    contaAna()

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun contaAna() {
    val contaAna = Conta()
    contaAna.titular = "Ana"
        println(contaAna.titular)
    contaAna.numero = 27
        println(contaAna.numero)
    contaAna.saldo = 10002.0
        println(contaAna.saldo)
}

fun contaGuerra() {
    val contaGuerra = Conta()
    contaGuerra.titular = "Guerra"
        println(contaGuerra.titular)
    contaGuerra.numero = 4
        println(contaGuerra.numero)
    contaGuerra.saldo = 200.0
        println(contaGuerra.saldo)
}