algoritmo "semnome"
// Função :
// Autor :
// Data : 30/08/2011
// Seção de Declarações 
var
      a : vetor [0..2,0..2] de inteiro
      linha,coluna: inteiro
inicio

      para linha de 0 ate 2 passo 1 faca
           para coluna de 0 ate 2 passo 1 faca
             escreval("Entre com o valor de a[",linha,",",coluna,"]:")
             leia(a[linha,coluna])
           fimpara
      fimpara
      
      para linha de 0 ate 2 passo 1 faca
           para coluna de 0 ate 2 passo 1 faca
             escreva(" ",a[linha,coluna])
           fimpara
           escreval("")
      fimpara

fimalgoritmo
