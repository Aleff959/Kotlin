fun deposito() {
  
  imprimirCabecalho("Depósito")
  
  println("Digite --- CANCELAR --- para Voltar ao menu anterior")
  println("----------------------------")
  println("""
  Quanto deseja depositar?
  (Ex: R$ 50.86)
  """)
  println("----------------------------")

  val entradaDeposito = readln().trim().uppercase()
  val adcSaldo: Double? = entradaDeposito.toDoubleOrNull()
  
  if(entradaDeposito == "CANCELAR") {
  println("Operação cancelada. Voltando ao menu anterior...")
    return
    
  } else {
  
    if (adcSaldo != null && adcSaldo >= 0.01) {
      
      println("Adicionando saldo à sua conta...")
      saldo += adcSaldo
      println("""
      Saldo adicionado!!!
      ---Seu saldo atual é: R$ ${"%.2f".format(saldo)}---
      """)
      println("--------------------------")
      println("Voltando ao menu principal...")
      return
      
    } else if (adcSaldo != null && adcSaldo <= 0.0) {
      
      println("É necessário adicionar um valor acima de: R$ 0.0")
      println("Voltando ao menu principal")
      return
      
    } else {
      // Caso: adcSaldo é NULL
    println("Erro de formato! Por favor, insira um valor numérico (Ex: 50.00).")
    println("Voltando ao menu principal")
    return
    
    }
  }
}