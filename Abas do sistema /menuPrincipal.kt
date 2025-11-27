fun exibirMenu(): Int? {

  imprimirCabecalho("Caixa Eletrônico")

  println("Caixa Eletrônico")
  println("-----------------------")
  println("1 - Depósito")
  println("2 - Saque")
  println("3 - Extrato")
  println("0 - Sair")
  println("-----------------------")
  println("Selecione uma opção:")
    
  
  val op_menu = readln().trim().toIntOrNull()
  
  return op_menu
}