fun main() {
    //Palavra reservada constante não pode ser alterada
    //Ex.: val entrada = "olá" [dá erro]
    val entrada = "Bem vindo ao Bytebank"

    //Palavra reservada variável pode ser alterada;
    //Ex.: var titurlar = "Clara" [não dá erro]
    var titular = "Ana"
    
    //Primeiro Exemplo:
    println(titular)

    //Segundo Exemplo:
    println("$titular")

    //Terceiro Exemplo:
    println("$entrada $titular")

    //Quarto Exemplo:
    println("$entrada" + ": " + titular)
}