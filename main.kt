 fun main () {
   
  var opcao:int?
  
  
  do {
    opcao = menu()
    when(opcao) {
    
    1 -> deposito()
    2 -> saque()
    0 -> println("Encerando a operação...")
    null -> println("""Erro: comando inválido!!!
    Digite apenas 1, 2 ou 0 para sair.""")
    } else {
      println("Comando não reconhecido. Tente novamente!")
    }
    
  } while (opcao != 0)
  
  
}