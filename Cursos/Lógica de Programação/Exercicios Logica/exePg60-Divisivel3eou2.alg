algoritmo "divisileou"
var
x:inteiro
inicio
   escreval("Entre com um valor.")
	leia(x)
	
   se ( ( x%3 = 0) e ( x%2 = 0 )) entao
  	   escreval("É divisível por 3 e 2")
  	senao
      escreval("Não é divisível por 3 e 2")
  	fimse
  	
  	se ( ( x%3 = 0) ou ( x%2 = 0 )) entao
  	   escreval("É divisível por 3 ou 2")
  	senao
      escreval("Não é divisível por 3 ou 2")
  	fimse
  	
fimalgoritmo
