algoritmo "prestacao"
var
	n1,n2,n3,media: real
inicio
	
   escreval("Entre com o valor da 1ª nota.")
	leia(n1)
   escreval("Entre com o valor da 2ª nota.")
	leia(n2)
	escreval("Entre com o valor da 3ª nota.")
	leia(n3)
	
	media <- (n1+n2+n3)/3

   se (media>=7) entao
      //caso a média seja maior ou igual a 7
  	   escreval("Aprovado.")
  	senao
  	   //caso a média seja menos que 7
  	   escreval("Reprovado.")
  	fimse
   	
   escreval("A media é: ",media)
   
fimalgoritmo

