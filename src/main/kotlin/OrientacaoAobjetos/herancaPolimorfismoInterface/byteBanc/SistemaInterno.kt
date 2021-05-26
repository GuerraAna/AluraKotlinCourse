package OrientacaoAobjetos.herancaPolimorfismoInterface.byteBanc

class SistemaInterno {

    fun entrar(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)) {
            println("Bem vindo ao ByteBank!")
        } else {
            println("Falha na autenticação.")
        }
    }
}