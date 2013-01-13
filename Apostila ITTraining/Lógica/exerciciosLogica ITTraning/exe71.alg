algoritmo "contador"
// Função :
// Autor :
// Data : 27/08/2011
// Seção de Declarações 
var
     contador :inteiro
inicio
      
      escreval("Usando enquanto:")
      contador <-15
      enquanto contador <=20 faca
              escreval(contador,"^2 = ",contador*contador)
              contador <- contador +1
      fimenquanto
      
      escreval("Usando repita:")
      contador <-15
      repita
            escreval(contador,"^2 = ",contador*contador)
            contador <- contador +1
      ate (contador>20)
      
      escreval("Usando para:")
      para contador de 15 ate 20 passo 1 faca
              escreval(contador,"^2 = ",contador*contador)
      fimpara
      
fimalgoritmo
