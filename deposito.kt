fun deposito() {
  
  imprimirCabecalho("Depósito")
  
  println("""
  Quanto deseja depositar?
  (Ex: R$ 50.00)
  """)
  println("----------------------------")

  val adcSaldo: Double? = readln().trim()
  
  
  if (adcSaldo != null || adcSaldo >=0.01) {
    
    println("Adicionando saldo à sua conta...")
    saldo += adcSaldo
    println("""
    Saldo adicionado!!!
    ---Seu saldo atual é: R$ {"%.2f.format(saldo)}---
    """)
    println("--------------------------")
    println("Voltando ao menu principal...")
    break
    
  } else if (adcSaldo != null && adcSaldo <= 0.0) {
    
    println("É necessário adicionar um valor acima de: R$ 0.0")
    println("")
    
  }
}