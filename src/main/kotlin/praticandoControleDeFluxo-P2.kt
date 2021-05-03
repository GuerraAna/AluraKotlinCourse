fun main() {
    println("Entre com um valor:")
    val entrada = readLine()!!.toInt()

    // Loop em ordem crescente.
    for (i in 1..entrada){
        val valor = "$i"
        val nota = "A ana é nota $i"

        println(valor)
        println(nota)
        println()
    }

    // Loop em ordem descrescente.
    for (j in entrada downTo 1){
        val valor = "$j"
        val nota = "A ana é nota $j"

        println(valor)
        println(nota)
        println()
    }

    // Utilização do Loop com step.
    for (w in entrada..10 step 2){
        val pares = "$w"
        println(pares)
        println()
    }
}