fun main () {
  
  println("Caixa Eletrônico")
  println("-----------------------")
  println("1 - Depósito")
  println("2 - Saque")
  println("0 - Sair")
  println("-----------------------")
  println("Digite uma opção:")
  
  var saldo: Double = 0.0
  val opcao = readln().trim().toIntOrNull()
  var adc: Double = 0.0
  var sub: Double = 0.0
  
  when (opcao) {
    "1" -> println("Vamos depositar!
    Seu saldo atual é: R$ $saldo")
    "2" -> println("Vamos sacar!
    Seu saldo é: R$ $saldo")
  }
  
  do {
    if (opcao in 0..2) {
      when(opcao){
        1 -> {
          println("Qual o valor do depósito?")
          adc: Double? = readln().trim()
          saldo += adc
          println("Seu saldo atual é: R$ $saldo")
          }
          
        2 -> {
          println("Qual o valor do saque?")
          sub: Double? = readln().trim()
          if(saldo <= sub) {
            println("Não há saldo suficiente. É necessário adicionar fundos!")
            break
          } else if (saldo >= sub){
            saldo -= sub
            println("Saque concluído com sucesso!")
            println("Seu saldo atual é: R$ $saldo")
          }
        }
        }
      } else {
      println("Cancelando a operação...")
        break
      }
      }
    }
  } while (opção != 0)
}