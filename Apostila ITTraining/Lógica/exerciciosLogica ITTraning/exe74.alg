algoritmo "contador"
// Fun��o :
// Autor :
// Data : 27/08/2011
// Se��o de Declara��es 
var
     contador,n,soma :inteiro
inicio

      escreval("Entre com um n�mero:")
      leia(n)

      contador <-1
      soma <- 0
      enquanto contador <=n faca
              soma <- soma + contador
              contador <- contador +1
      fimenquanto
      escreval("Soma usando enquanto:",soma)

      contador <-1
      soma <- 0
      repita
            soma <- soma + contador
            contador <- contador +1
      ate (contador>n)
      escreval("Soma usando repita:",soma)

      soma <- 0
      para contador de 1 ate n passo 1 faca
            soma <- soma + contador
      fimpara
      escreval("Soma usando para:",soma)
      
fimalgoritmo
