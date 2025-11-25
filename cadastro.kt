fun cadastro() {
  
  bordas()
  imprimirCabecalho("Caixa Eletrônico")
  imprimirCabecalho("Cadastro")
  
  println("""Seu banco é Tem agência física?
  1 - Sim
  2 - Não 
  3 - Não tenho certeza 
  """)
  
  val fisicoOuVirtual = readlnOrNull().trim().toIntOrNull()
  
  when(fisicoOuVirtual) {
    if(fisicoOuVirtual in 1..3){
      1 -> {
      
      println("Lista de Bancos com Agência Física:")
      println("$bankListF")
      bordas()
      println("Digite a opção correspondente ao seu banco:")
      val meuBancoF = readlnOrNull().trim().toIntOrNull()
      return
      }
      2 -> {
      
      println("Lista de Bancos Sem Agenda Física:")
      println("$bankListI")
      bordas()
      
      }
      3 -> {
      
      println("Lista de bancos, com e sem Agência Física")
      println("$bankListF")
      bordas()
      
    }else if (fisicoOuVirtual == null {
      
      println("Opção não reconhecida! Escolha entre 1, 2 e 3.")
      return
      
    }else{
    
      println("Opção inválido! Escolha entre 1, 2 e 3.")
      return
      
    }
  }
  
  println("Digite a opção correspondente ao seu banco:")
  val meuBanco = readln().trim().toIntOrNull()
  
    }
    }
  }
}
