algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 03/04/2012

procedimento soma ()
inicio
 escreval("Soma: ", (x+y) )
fimprocedimento

procedimento subtracao ()
inicio
 escreval("Subtra��o: ", (x-y) )
fimprocedimento

procedimento multiplicacao ()
inicio
 escreval("Multiplica��o: ", (x*y) )
fimprocedimento

procedimento divisao ()
inicio
 escreval("Divis�o: ", (x/y) )
fimprocedimento

var
x,y : real
op  : literal
inicio

   repita

       escreval("As opera��es disponiveis s�o: + , -, * , /")
       escreva("Entre com a opera��o ou e para sair:")
       leia(op)
       
       se op = "e" entao
            interrompa
       fimse
       
       escreva("Entre com o valor de x:")
       leia(x)
       escreva("Entre com o valor de y:")
       leia(y)
       
       escolha(op)
                 caso "+"
                    soma()
                 caso "-"
                    subtracao ()
                 caso "*"
                    multiplicacao ()
                 caso "/"
                    divisao ()
                 outrocaso
                          escreva("Operador inv�lido")
       fimescolha
       
   fimrepita
       

fimalgoritmo


