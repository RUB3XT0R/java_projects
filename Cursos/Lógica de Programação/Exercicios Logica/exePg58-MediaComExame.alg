algoritmo "prestacao"
var
	n1,n2,n3,media,exame: real
inicio
	
   escreval("Entre com o valor da 1ª nota.")
	leia(n1)
	
   escreval("Entre com o valor da 2ª nota.")
	leia(n2)
	
	escreval("Entre com o valor da 3ª nota.")
	leia(n3)
	
	media <- (n1+n2+n3)/3

   se (media>=7) entao
  	   escreval("Aprovado.")  //caso seja maior que 7
  	senao
  	   //bloco de instrução caso a media seja menor que 7
      escreval("A media é: ",media)
     	
      escreval("Entre com a nota do exame")
	   leia(exame)
	
      media <- (media+exame)/2
	   
  	   se (media>=5) entao
  	      escreval("Aprovado em exame.")
      senao
  	      escreval("Reprovado.")
      fimse
      
  	fimse    	
   escreval("A media é: ",media)
fimalgoritmo

