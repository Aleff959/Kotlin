fun login() {
  
  do {
    
    println("Digite seu nome de usuário:")
    val userLogin: String = readlnOrNull().orEmpty().trim()
    
    println("Digite sua senha de usuário:")
  val passwordLogin = readlnOrNull().orEmpty().trim()
    
  } while (userLogin != nomeUsuario && passwordLogin != senha)
  
  exibirMenu() //Que exibirá o menu de depósito, saque, extrato...etc.
  
}