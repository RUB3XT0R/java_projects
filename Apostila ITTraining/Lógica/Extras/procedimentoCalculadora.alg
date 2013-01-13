algoritmo "semnome"
// Função :
// Autor :
// Data : 03/04/2012

procedimento soma ()
inicio
 escreval("Soma: ", (x+y) )
fimprocedimento

procedimento subtracao ()
inicio
 escreval("Subtração: ", (x-y) )
fimprocedimento

procedimento multiplicacao ()
inicio
 escreval("Multiplicação: ", (x*y) )
fimprocedimento

procedimento divisao ()
inicio
 escreval("Divisão: ", (x/y) )
fimprocedimento

var
x,y : real
op  : literal
inicio

   repita

       escreval("As operações disponiveis são: + , -, * , /")
       escreva("Entre com a operação ou e para sair:")
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
                          escreva("Operador inválido")
       fimescolha
       
   fimrepita
       

fimalgoritmo


