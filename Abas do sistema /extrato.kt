fun extrato() {
  
  imprimirExtrato("Extrato Bancário")
  
  println("1 - Extrato Simplificado")
  println("2 - Extrato Completo")
  println("0 - Sair")
  
  val opcaoExtrato = readln().trim.toIntOrNull()
  
  when(opcaoExtrato) {
    
    1 -> {
    println("""
Cliente: [$nameID]
Agência: [$agencia] | Conta: [$conta]
Horário:
----------------------------------------
Saldo em conta: R$ ${"%.2f".format(saldo)}
    """)
    bordas()
  }
    2 -> {
    println("""
Cliente: [$nameID]
Agência: [$agencia] | Conta: [$conta]
Horário:
----------------------------------------
DATA | DESCRICAO | VALOR  | SALDO
----------------------------------------
20/11   | SALDO ANTERIOR          | + R$ 1.500,50    | R$ 1.500,50 
21/11   | PIX ENVIADO             | - R$ 500,00      | R$ 1.000,50
22/11   | DEPÓSITO TED            | + R$ 800,00      | R$ 1.800,50
23/11   | COMPRA FARMÁCIA         | - R$ 55,30       | R$ 1.745,20
24/11   | PIX RECEBIDO            | + R$ 250,00      | R$ 1.995,20
---------------------------------------
SALDO FINAL: R$ ${"%.2f".format(saldo)}    """)
    bordas()
  }
    3 -> return
  }
}