algoritmo "semnome"
// Função :
// Autor :
// Data : 30/08/2011
// Seção de Declarações 
var
      A,B : vetor [0..9] de inteiro
      i: inteiro
inicio

      //lendo o vator a
      para i de 0 ate 9 passo 1 faca
             escreval("Entre com o valor de a[",i,"]:")
             leia(a[i])
      fimpara
      
      para i de 0 ate 9 passo 1 faca
      
             se ((i%2)=0)  entao
                b[i] <- a[i]*5
             senao
                b[i] <- a[i]+5
             fimse

      fimpara
      
      escreva("O vetor b:")
      para i de 0 ate 9 passo 1 faca
             escreva(" ",b[i])
      fimpara

fimalgoritmo
