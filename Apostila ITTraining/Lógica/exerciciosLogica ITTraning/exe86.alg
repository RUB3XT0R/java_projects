algoritmo "semnome"
// Função :
// Autor :
// Data : 30/08/2011
// Seção de Declarações 
var
      a : vetor [0..4] de inteiro
      i,soma: inteiro
inicio

      soma <- 0
      para i de 0 ate 4 passo 1 faca
             escreval("Entre com o valor de a[",i,"]:")
             leia(a[i])
             
             se (a[i]%2 <> 0) entao
                  soma <-soma+a[i]
             fimse
             
      fimpara
      
      escreva("A soma dos impares do vetor é:",soma)


fimalgoritmo
