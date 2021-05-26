package OrientacaoAobjetos.herancaPolimorfismoInterface.byteBanc

fun testaAutenticacao() {
   val gerente = Gerente(
       nome = "Ana Guerra",
       cpf = "113.232.321-33",
       salario = 1233.0,
       senha = 1230
   )

    val diretor = Diretor(
       nome = "Marcos Guerra",
       cpf = "763.430.231-74",
       salario = 12213123.0,
       senha = 1233,
        plr = 230.0
   )

    val sistema = SistemaInterno()
    sistema.entrar(gerente, 1230)
    sistema.entrar(diretor, 1233)

}
