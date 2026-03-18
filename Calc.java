programa {
  funcao inicio() {
    inteiro num1, num2
    real resultado = 0
    caracter operador

    linha()
    escreva("Calculadora de Numeros inteiros\n")
    linha()

    escreva("Digite um numero: ")
    leia(num1)
    escreva("Digite a operação: ")
    leia(operador)
    escreva("Digite outro numero: ")
    leia(num2)

    escolha (operador) {
      caso "+":
        linha() 
        resultado = num1 + num2
        escreva("Soma = ", resultado)
        pare
      caso "-":
        linha()
        resultado = num1 - num2
        escreva("Subtraçao = ", resultado)
        pare
      caso "*":
        linha()
        resultado = num1 * num2
        escreva("Multiplicaçao = ", resultado)
        pare
      caso "/":
        linha()
        resultado = num1 / num2
        escreva("Divisao = ", resultado)
        pare
    }
  }
  funcao linha(){
    escreva("--------------------------------\n")
  }
}
