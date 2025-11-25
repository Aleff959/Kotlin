fun saque() {
  
  imprimirCabecalho("Saque")
  
  println("Seu saldo atual é: R$ ${"%.2f".format(saldo)}")
  println("Quanto deseja sacar? (Ex: 53.89)")
  
  val saidaSaldo: String = readln().trim()
  val saqueSaldo: Double? = saidaSaldo.toDoubleOrNull()
  
  if(saqueSaldo == null) {
    
    println("Erro de formato! Por favor, insira um valor numérico (Ex: 50.00).")
    println("Voltando ao menu principal")
    println("--------------------------")
    return
    
  } else if (saqueSaldo <= 0.0) {
    println("O valor do saque deve ser maior que R$ 0,00.")
    println("Seu saldo atual é: R$ ${"%.2f".format(saldo)}")
    println("--------------------------")
    return
      
  } else if (saqueSaldo > saldo) {
      println("Saldo insuficiente. Adicione antes de sacar!")
      println("Seu saldo atual é: R$ ${"%.2f".format(saldo)}")
      println("--------------------------")
      return
      
  } else {
  
      saldo -= saqueSaldo
      println("""
      -------------------------------
      Saque concluído com sucesso!
      Seu NOVO saldo é: R$ ${"%.2f".format(saldo)}
      -------------------------------
      """)
      println("Voltando ao menu principal...")
      println("--------------------------")
      return
  }
}