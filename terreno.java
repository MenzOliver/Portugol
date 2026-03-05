programa {
  inclua biblioteca Matematica
	funcao inicio (){

		//valores basicos
		real largura, comprimento, metroQuadrado
		real area, preco

    linha()
		escreval("Bem vindo ao calculo de terreno!")
    linha()
    branco()
    escreva("Digite a largura do terreno: ") leia (largura)
    escreva("Digite o comprimento do terreno: ") leia(comprimento)
    escreva("Digite o valor do metro quadrado: ") leia(metroQuadrado)
    branco()
    area = Matematica.arredondar((comprimento * largura),2)
    preco = Matematica.arredondar((area * metroQuadrado),2)

    escreval("Area do terreno = " + area)
    escreval("Preco do terreno = " + preco)
	}
  funcao branco(){
    escreval("")
  }
	funcao linha (){
    escreval("----------------------------------------")
  }
  funcao vazio escreval(cadeia txt){
    escreva(txt + "\n")

  }
}
