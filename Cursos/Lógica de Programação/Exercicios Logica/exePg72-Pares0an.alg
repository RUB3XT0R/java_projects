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
      enquanto contador <=n faca
              escreval(contador)
              contador <- contador +2
      fimenquanto
      
      escreval("Usando repita:")
      contador <-0
      repita
            escreval(contador)
            contador <- contador +2
      ate (contador>n)
      
      escreval("Usando para:")
      para contador de 0 ate n passo 2 faca
            escreval(contador)
      fimpara
      
fimalgoritmo
