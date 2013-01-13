algoritmo "contador"
// Função :
// Autor :
// Data : 27/08/2011
// Seção de Declarações 
var
     contador :inteiro
inicio

      escreval("Usando enquanto:")
      contador <-0  //contadr inicia do 0
      enquanto contador<=5 faca        //enquanto for menor ou igual
              escreval(" ",contador)   //mostra na tela
              contador <- contador +1  //incrementa mais um
      fimenquanto

      escreval("Usando repita:")
      contador <-0
      repita
            escreval(" ",contador)
            contador <- contador +1
      ate (contador>5)
      
      escreval("Usando para:")
      para contador de 0 ate 5 passo 1 faca
            escreval(" ",contador)
      fimpara
      
fimalgoritmo
