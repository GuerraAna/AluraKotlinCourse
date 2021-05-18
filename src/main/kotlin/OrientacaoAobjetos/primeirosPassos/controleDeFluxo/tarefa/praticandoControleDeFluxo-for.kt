package OrientacaoAobjetos.PrimeirosPassosKotlin

fun main() {
   praticandoControleF1()
}
fun praticandoControleF1(){
    println("Insira o primeiro valor:")
    val inteiro: Int = readLine()!!.toInt()
    println("Insira o segundo valor:")
    val double: Double = readLine()!!.toDouble()

    val x = soma(inteiro, double)
    if(x > 0) {
        println("O número é positivo.")
    }else if(x == 0) {
        println("O número é nulo.")
    }else {
        println("O número é negativo")
    }
}
fun soma(inteiro: Int, double: Double): Int{
    return inteiro.plus(double).toInt()
}