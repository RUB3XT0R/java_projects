algoritmo "lanchonete"
var
	cod,qtde: inteiro
inicio
	
repita
   escreval("Menu.")
   escreval("100) Cachorro Quente - R$2.00")
   escreval("101) Bauru Simples - R$2.50")
   escreval("102) Americano - R$2.80")
   escreval("103) Hamburguer - R$1.90")
   escreval("104) Cheeseburguer- R$2.00")
   escreval("105) Refrigerante - R$1.50")
   escreval("106) Água - R$1.00")
   escreval("Entre com o código do produto ou 0 para sair.")
   leia(cod)
   se cod = 0 entao
       interrompa
   fimse
   escreval("Entre com a quantidade do produto.")
   leia(qtde)
   

   escreval("Você comprou:")
   escolha(cod)
               caso 100
                    escreval("Cachorro Quente (x",qtde,") - R$",(qtde*2))
               caso 101
                    escreval("Bauru Simples (x",qtde,") - R$",(qtde*2.5))
               caso 102
                    escreval("Americano (x",qtde,") - R$",(qtde*2.8))
               caso 103
                    escreval("Hamburguer (x",qtde,") - R$",(qtde*1.9))
               caso 104
                    escreval("Cheeseburguer (x",qtde,") - R$",(qtde*2))
               caso 105
                    escreval("Refrigerante (x",qtde,") - R$",(qtde*1.5))
               caso 106
                    escreval("Água (x",qtde,") - R$",qtde)
               outrocaso
                    escreval("Você digitou um código inválido.")
               
   fimescolha
ate falso
   	
fimalgoritmo

