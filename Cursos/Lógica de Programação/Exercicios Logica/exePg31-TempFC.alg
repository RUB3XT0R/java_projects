algoritmo "temperatura"
var
   //declaração das variaveis
   //C = temperatura em Celsius
   //F = temperatura em Fahrenheint
	C,F: real
inicio
   //pedido de valor
	escreva("Entre com temperatura em Fahrenheit.")
	leia(F) //lendo a temp. em Fahrenheit
 	 C<-(F-32)*(5/9) //conversão C para F 	
	escreva("A temperatura em Celsius é ",C)
fimalgoritmo

