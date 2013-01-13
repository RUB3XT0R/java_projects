algoritmo "maior"
var
	x,y,sub: inteiro
inicio
	
   escreval("Entre com um valor.")
	leia(x)
	escreval("Entre com um valor.")
	leia(y)

   se (x>y) entao
  	   sub <- x-y  //caso x seja maior que y
  	senao
  	   sub <- y-x  //caso y seja maior que x
  	fimse
   	
   escreval("x-y ou y-x =",sub)
	
   
fimalgoritmo

