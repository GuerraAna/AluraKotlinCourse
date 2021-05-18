package kotlinPOO

fun main() {
    testaCopiasEReferencias()
}

fun testaCopiasEReferencias() {
    val numeroInteiro: Int
    val numeroDouble = 20.0

    numeroInteiro = numeroDouble.toInt()
        println(numeroInteiro)
        println()
}
