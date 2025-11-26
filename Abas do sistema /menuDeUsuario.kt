fun menuInicial() {
  
  imprimirCabecalho("Caixa Eletrônico")
  
  while(true) {
    println("""Já tem cadastro?
    
    1 - Fazer login
    2 - Fazer cadastro 
    0 - Encerrar""")
    
    val escolhaInicial = readlnOrNull().orEmpty().trim().toIntOrNull()
    
    when(escolhaInicial) {
      
      1 -> login()
      2 -> cadastro()
      0 -> {
        println("Encerrando a operação...")
        exitProcess(0)
        }
      in 3..9 -> println("Opção inválida!")
      in 10..99 -> println("Aí já tá inventando coisa...")
      in 100..999 -> println("Oh loco, aí não é nem um caixa eletrônico, é um banco central...")
      in 1000..10000 -> println("Há-Há!!!")
      else -> println("Opção não reconhecida!")
      
    }
  }
}
