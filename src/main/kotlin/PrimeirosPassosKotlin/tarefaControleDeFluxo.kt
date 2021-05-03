package PrimeirosPassosKotlin

fun main () {
    testeCondicoes()
}
fun testeCondicoes() {
    // Primeiro Teste (for).
    for (i in 1..5) {
        println("A resposta para o primeiro teste é: $i")
        println()
    }

    // Segundo Teste (for).
    println("Insira um número para o segundo teste:")
    for (j in 5 downTo 1) {
        println("A resposta para o segundo teste é: $j")
        println()
    }

    // Terceiro Teste (for).
    println("Insira um número para o terceiro teste:")
    for (w in 5 downTo 1 step 2) {
        println("A resposta para o terceiro teste é: $w")
    }

    // Quarto Teste (while).
    var k = 0
    while ( k<5 ) {
        println(k)
        k++

        if ( k == 2 ){
            break
        }
    }
}