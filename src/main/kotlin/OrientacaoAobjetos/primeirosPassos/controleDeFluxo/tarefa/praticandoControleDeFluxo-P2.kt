package OrientacaoAobjetos.PrimeirosPassosKotlin

fun main() {
    println("Entre com um valor:")
    val entrada = readLine()!!.toInt()
    forCrescente(entrada)
    forDecrescente(entrada)
    forStep(entrada)
}

fun forCrescente(entrada: Int) {
    for (i in 1..entrada) {
        val valor = "$i"
        val nota = "A ana é nota $i"

        println(valor)
        println(nota)
        println()
    }
}

fun forDecrescente(entrada: Int){
    for (j in entrada downTo 1){
        val valor = "$j"
        val nota = "A ana é nota $j"

        println(valor)
        println(nota)
        println()
    }
}

fun forStep(entrada: Int){
    for (w in entrada..10 step 2){
        val pares = "$w"
        println(pares)
        println()
    }
}
