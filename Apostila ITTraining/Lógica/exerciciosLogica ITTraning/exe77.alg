algoritmo "contador"
// Fun��o :
// Autor :
// Data : 27/08/2011
// Se��o de Declara��es 
var
     contador,n,fat :inteiro
inicio

      escreval("Entre com um n�mero:")
      leia(n)

      contador <-1
      fat <- 1
      enquanto contador <=n faca
              fat <- fat*contador
              contador <- contador +1
      fimenquanto
      escreval("Soma usando enquanto:",fat)

      contador <-1
      fat <- 1
      repita
            fat <- fat*contador
            contador <- contador +1
      ate (contador>n)
      escreval("Soma usando repita:",fat)

      fat <- 1
      para contador de 1 ate n passo 1 faca
            fat <- fat*contador
      fimpara
      escreval("Soma usando para:",fat)
      
fimalgoritmo
