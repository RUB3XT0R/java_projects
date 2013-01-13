algoritmo "prestacao"
var
	valor,taxa,tempo,p: real
inicio
	
   escreval("Entre com o tempo de atraso.")
	leia(tempo)
	
   escreval("Entre com a taxa.")
	leia(taxa)
	
	escreval("Entre com o valor.")
	leia(valor)
	
   p <- valor + ( valor * ( taxa / 100 ) * tempo )
                                                    	
   escreval("valor da prestação: ",p)
fimalgoritmo

