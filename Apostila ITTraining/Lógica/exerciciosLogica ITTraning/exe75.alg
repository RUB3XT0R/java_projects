algoritmo "contador"
// Função :
// Autor :
// Data : 27/08/2011
// Seção de Declarações 
var
     contador,n,soma :inteiro
inicio

      escreval("Entre com um número:")
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
      ate (contador>10)
      escreval("Soma usando repita:",soma)

      soma <- 0
      para contador de 1 ate 10 passo 1 faca
            soma <- soma + contador
      fimpara
      escreval("Soma usando para:",soma)
      
fimalgoritmo
