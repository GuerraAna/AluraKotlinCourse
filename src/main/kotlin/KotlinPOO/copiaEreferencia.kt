package KotlinPOO

fun main(){
    val primeiroNumero = 10
    var segundoNumero = primeiroNumero
    segundoNumero++

        println(primeiroNumero)
        println(segundoNumero)
        println()

    val contaJoao = Conta()
    contaJoao.titular = "João Franciso"
        println("titular da conta João: ${contaJoao.titular}")
        println()

    val contaMaria = contaJoao
    contaJoao.titular = "Maria Cardoso"
        println("titular da conta Maria: ${contaMaria.titular}")
        println()
}