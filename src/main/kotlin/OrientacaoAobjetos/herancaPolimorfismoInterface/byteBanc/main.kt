package OrientacaoAobjetos.herancaPolimorfismoInterface.byteBanc

fun main() {
    //Primeiro Funcionário.
    val ana = Funcionario(
        nome = "Ana Guerra",
        cpf = "538.909.234-00",
        salario = 4312.0,
        )
    println("Nome: ${ana.nome}")
    println("CPF: ${ana.cpf}")
    println("Salário: ${ana.salario}")
    println("Bonificação: ${ana.bonificacaoF()}")
    println()

    //Segundo Funcionário:
    val felipe = Gerente(
        nome = "Felipe Guerra",
        cpf = "234.345.676-12",
        salario = 123412.0,
        senha = 1234
    )
    println("Nome: ${felipe.nome}")
    println("CPF: ${felipe.cpf}")
    println("Salário: ${felipe.salario}")
    println("Bonificação: ${felipe.bonificacaoG()}")

    if (felipe.autenticar(senha = 1234)){
            println("Autenticação válida")
        } else {
            println("Autenticação inválida")
    }
}