data class Transacao(
    val data: String,        // Ex: 27/11
    val descricao: String,
    val valor: Double,       // Positivo para depósito, negativo para saque
    val saldoApos: Double    // Saldo após a transação
)

var saldo: Double = 0.0
val transacoes: MutableList<Transacao> = mutableListOf()

fun imprimirCabecalho(titulo: String){
    println("\n---------$titulo---------")
    println("----------------------------") 
}

fun imprimirExtrato(titulo: String){
    println("=======================================")
    println("\n----$titulo----")
    println("--------------------------")
}

fun bordas() {
    println("=======================================")
}

/*
fun bankListF() {
    
    val bancoF: List<String> = listOf(
    "1. Banco do Brasil",
    "2. Caixa Econômica Federal",
    "3. Itaú Unibanco",
    "4. Bradesco",
    "5. Santander Brasil",
    "6. Banco Safra",
    "7. Banco Mercantil do Brasil",
    "8. Banco Votorantim",
    "9. Banco Pan",
    "10. Banco BMG",
    "11. BRB - Banco de Brasília",
    "12. Banrisul",
    "13. Banco da Amazônia",
    "14. Banco do Nordeste do Brasil",
    "15. Banco Alfa",
    "16. Banco Daycoval",
    "17. Banco Citibank S.A.",
    "18. Banco Industrial do Brasil",
    "19. Sicoob",
    "20. Sicredi"
    )
}
 
    fun bankListI() {
        
    val instituicoesDePagamento: List<String> = listOf(
        "1. Nubank",
        "2. PicPay",
        "3. Mercado Pago",
        "4. PagBank",
        "5. Stone",
        "6. Cielo",
        "7. Rede",
        "8. Getnet",
        "9. RecargaPay",
        "10. Ame Digital",
        "11. C6 Bank",
        "12. Banco Inter",
        "13. Affinpay",
        "14. Ebanx",
        "15. MaxiPago",
        "16. Wirecard",
        "17. Zoop"
        )
    }

*/

data class Usuario(
    val nome: String,
    val idade: Int,
    val nomeUsuario: String,
    val senha: String,
    val agencia: String, 
    val conta: String
)

val listaDeUsuarios = mutableListOf<Usuario>()
const val AGENCIA_PADRAO = "0001" 

fun gerarNumeroDeConta(): String {
    val numero = Random.nextInt(100000, 1000000)
    return numero.toString()
}

fun horaFormat(): String {
    val agora = LocalDateTime.now()
    val formatador = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss")
    return agora.format(formatador)
}

fun diaFormat(): String {
    val formatador = DateTimeFormatter.ofPattern("dd/MM")
    return LocalDateTime.now().format(formatador)
}
