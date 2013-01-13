algoritmo "semnome"
// Função :
// Autor :
// Data : 30/08/2011
// Seção de Declarações 
var
      a,b,c : vetor [0..4] de inteiro
      i: inteiro
inicio

      para i de 0 ate 4 passo 1 faca
             escreval("Entre com o valor de a[",i,"]:")
             leia(a[i])
      fimpara

      para i de 0 ate 4 passo 1 faca
             escreval("Entre com o valor de b[",i,"]:")
             leia(b[i])
      fimpara
      
      para i de 0 ate 4 passo 1 faca
                c[i] <- b[i] - a[i]
      fimpara
      
      escreva("O vetor c:")
      para i de 0 ate 4 passo 1 faca
             escreva(" ",c[i])
      fimpara

fimalgoritmo
