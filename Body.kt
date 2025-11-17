fun main () {
  
  println("Caixa Eletrônico")
  println("-----------------------")
  println("1 - Depósito")
  println("2 - Saque")
  println("0 - Sair")
  println("-----------------------")
  println("Digite uma opção:")
  
  var saldo:Double = 0.0
  val opcao: Int? = readln()
  
  when (opcao) {
    "1" -> println("Vamos depositar!
    Seu saldo atual é: R$ $saldo")
    "2" -> println("Vamos sacar!
    Seu saldo é: R$ $saldo")
  }
  
  do {
    
    
    
  } while (opção != 0)
  
}