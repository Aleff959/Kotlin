fun deposito() {
  if(opcao == 1) {
    println("Qual o valor do depósito?")
    adc: Double? = readln().trim()
    saldo += adc
    println("Seu saldo atual é: R$ $saldo")
    return
  }
}