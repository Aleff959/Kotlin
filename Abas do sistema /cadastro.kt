fun cadastro() {
  
  bordas()
  imprimirCabecalho("Cadastro")
  
  println ("Digite seu nome completo:")
  val nameID: String = readlnOrNull().orEmpty().trim().lowercase()
  
  println ("Qual sua idade?:")
  val ageID: Int? = readlnOrNull().orEmpty().trim().toIntOrNull()
  
  if (ageID == null || ageID <= 16) {
        println("❌ Idade inválida. Cadastro cancelado.")
        return
    }
  
  println("Digite o seu nome de usuário:")
  val userName: String = readlnOrNull().orEmpty().trim()
  
  println("Digite sua senha de usuário:")
  val passwordUser = readlnOrNull().orEmpty().trim()
  
  if (nameID.isBlank() || userName.isBlank() || passwordUser.isBlank()) {
        println("❌ Campos essenciais não podem ser vazios. Cadastro cancelado.")
        return
    }
  
  val novaAgencia = AGENCIA_PADRAO
    val novaConta = gerarNumeroDeConta()
    
    if (listaDeUsuarios.any { it.conta == novaConta }) {
        println("⚠️ Erro: Conta gerada já existe. Tente novamente.")
        return
    }

    val novoUsuario = Usuario(
        nome = nameID,
        idade = ageID,
        nomeUsuario = userName,
        senha = passwordUser,
        agencia = novaAgencia,
        conta = novaConta 
    )

    listaDeUsuarios.add(novoUsuario)

    println("\n✅ Usuário ${userName} cadastrado com sucesso!")
    println("Detalhes: Conta **${novaConta}**, Agência **${novaAgencia}**.")
    println("Total de usuários cadastrados: ${listaDeUsuarios.size}")