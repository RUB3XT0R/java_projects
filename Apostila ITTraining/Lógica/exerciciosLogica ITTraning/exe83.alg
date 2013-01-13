algoritmo "semnome"
// Função :
// Autor :
// Data : 30/08/2011
// Seção de Declarações 
var
      A,B : vetor [0..7] de inteiro
      i: inteiro
inicio

      //lendo o vator a
      para i de 0 ate 7 passo 1 faca
             escreval("Entre com o valor de a[",i,"]:")
             leia(a[i])
      fimpara

      para i de 0 ate 7 passo 1 faca
                b[i] <- a[i]*3
      fimpara
      
      escreva("O vetor b:")
      para i de 0 ate 7 passo 1 faca
             escreva(" ",b[i])
      fimpara

fimalgoritmo
