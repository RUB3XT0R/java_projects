algoritmo "contador"
// Fun��o :
// Autor :
// Data : 27/08/2011
// Se��o de Declara��es 
var
     contador,n :inteiro
inicio

      escreval("Entre com um n�mero:")
      leia(n)
      
      escreval("Usando enquanto:")
      contador <-0
      enquanto contador <=10 faca
              escreval(n," x ",contador," = ",(contador*n))
              contador <- contador +1
      fimenquanto
      
      escreval("Usando repita:")
      contador <-0
      repita
            escreval(n," x ",contador," = ",(contador*n))
            contador <- contador +1
      ate (contador>10)
      
      escreval("Usando para:")
      para contador de 0 ate 10 passo 1 faca
            escreval(n," x ",contador," = ",(contador*n))
      fimpara
      
fimalgoritmo
