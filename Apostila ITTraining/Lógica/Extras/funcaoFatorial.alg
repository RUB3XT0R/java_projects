algoritmo "semnome"
// Função :
// Autor :
// Data : 03/04/2012

funcao fatorial (x : inteiro) : inteiro
var fat,c: inteiro
inicio
   fat <- 1
   para c de 2 ate x passo 1 faca
       fat <- fat*c
   fimpara
   retorne fat
fimfuncao

var
y : inteiro
inicio

   para y de 0 ate 4 passo 1 faca
          escreval(" (",y,")!=",fatorial(y))
   fimpara
       

fimalgoritmo


