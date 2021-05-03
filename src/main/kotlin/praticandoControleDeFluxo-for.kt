fun main() {
    println("Insira o primeiro valor:")
    var inteiro: Int = readLine()!!.toInt()
    println("Insira o segundo valor:")
    var double: Double = readLine()!!.toDouble()

    var x = soma(inteiro, double)
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