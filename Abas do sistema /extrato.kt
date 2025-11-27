import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.math.abs

fun extrato(nameID: String, agencia: String, conta: String, saldo: Double, transacoes: List<Transacao>, imprimirExtrato: (String) -> Unit, bordas: () -> Unit) {
  
  var opcaoExtrato: Int? = null
    
  do {
    imprimirExtrato("Extrato Bancário")
    
    println("1 - Extrato Simplificado")
    println("2 - Extrato Completo")
    println("0 - Sair")
    
    opcaoExtrato = readln().trim().toIntOrNull()
    
    when(opcaoExtrato) {
      
      1 -> {
          println("""
Cliente: [$nameID]
Agência: [$agencia] | Conta: [$conta]
Horário: ${horaFormat()}
----------------------------------------
Saldo em conta: R$ ${"%.2f".format(saldo)}
          """)
          bordas()
      }
      
      2 -> {
          println("""
Cliente: [$nameID]
Agência: [$agencia] | Conta: [$conta]
Horário: ${horaFormat()}
----------------------------------------
DATA | DESCRICAO | VALOR | SALDO
----------------------------------------""")
          
          for (transacao in transacoes) {
              
              val valorFormatado = if (transacao.valor >= 0) {
                  "+ R$ ${"%.2f".format(transacao.valor)}"
              } else {
                  "- R$ ${"%.2f".format(abs(transacao.valor))}"
              }
              
              println("${transacao.data.padEnd(4)} | ${transacao.descricao.padEnd(25)} | ${valorFormatado.padEnd(14)} | R$ ${"%.2f".format(transacao.saldoApos)}")
          }
          
          println("---------------------------------------")
          println("SALDO FINAL: R$ ${"%.2f".format(saldo)}    ")
          bordas()
      }
      
      0 -> { 
          println("Saindo do Extrato...")
      }
      
      else -> {
          if (opcaoExtrato != null) {
              println("Opção inválida. Digite 1, 2 ou 0.")
          }
      }
    }
  } while (opcaoExtrato != 0)
}
