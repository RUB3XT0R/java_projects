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

      contador <-0
      soma <- 0
      enquanto contador <=n faca
              soma <- soma + contador
              contador <- contador + 2
      fimenquanto
      escreval("Soma usando enquanto:",soma)

      contador <-0
      soma <- 0
      repita
            soma <- soma + contador
            contador <- contador +2
      ate (contador>n)
      escreval("Soma usando repita:",soma)

      soma <- 0
      para contador de 0 ate n passo 2 faca
            soma <- soma + contador
      fimpara
      escreval("Soma usando para:",soma)
      
fimalgoritmo
