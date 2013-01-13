algoritmo "semnome"
// Função :
// Autor :
// Data : 30/08/2011
// Seção de Declarações 
var
      a,b : vetor [0..4] de inteiro
      i: inteiro
inicio
      para i de 0 ate 4 passo 1 faca
             escreval("Entre com o valor de a[",i,"]:")
             leia(a[i])
             
             se ((a[i]%2)=0)  entao
                b[i] <- a[i]
             senao
                b[i] <- a[i]*2
             fimse
             
      fimpara
      
      escreva("O vetor b:")
      para i de 0 ate 4 passo 1 faca
             escreva(" ",b[i])
      fimpara

fimalgoritmo
