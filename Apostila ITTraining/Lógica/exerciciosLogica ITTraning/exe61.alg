algoritmo "prestacao"
var
	x: inteiro
inicio
	
   escreval("Entre com um valor.")
	leia(x)
	
   se ( ( x%2 = 0) e ( x%3 = 0 )) entao
  	   escreval("� divis�vel por 2 e 3")
  	senao
      escreval("N�o � divis�vel por 2 e 3")
  	fimse
  	
  	se ( ( x%2 = 0) ou ( x%3 = 0 )) entao
  	   escreval("� divis�vel por 2 ou 3")
  	senao
      escreval("N�o � divis�vel por 2 e 3")
  	fimse
   	
fimalgoritmo

