fun main () {
  
  println("Caixa Eletrônico")
  println("-----------------------")
  println("1 - Depósito")
  println("2 - Saque")
  println("0 - Sair")
  println("-----------------------")
  println("Selecione uma opção:")
  
  val opcao_menu_1: String = readln().trim().toIntOrNull()
  
  do {
    if (opcao_menu_1 != null || opcao_menu_1 in 0..2){
    
      deposito()
      
    }
    
  } while (opcao_menu_1)
  
  
}