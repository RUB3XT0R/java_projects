algoritmo "maior"
var
	x: inteiro
inicio
	
   escreval("Entre com um valor.")
	leia(x)

   se (x>=0) entao
  	   escreva("x: ",x)
   senao
      escreva("x: ", ( x*(-1) ) )
  	fimse

   //----OU------

   se (x<0) entao
  	   x <- x*(-1)
  	fimse
  		
   escreval("x:",x)
	
  		
	
   
fimalgoritmo

