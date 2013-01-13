algoritmo "troca"
var
	a,b,c: inteiro
inicio
	
   escreval("Entre com um valor")
	leia(a)
	
   escreval("Entre com um valor.")
	leia(b)
	
	c <- a  //deixa salvo o valor de a em c
	a <- b  //a recebe seu novo valor
	b <- c  //b recebe o valor de a salvo em c
	
   escreval("A:",a," B:",b)
   
fimalgoritmo

