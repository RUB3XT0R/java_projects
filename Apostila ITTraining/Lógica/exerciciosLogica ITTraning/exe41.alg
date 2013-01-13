algoritmo "viagem"
var
	tempoGasto, vMedia, distancia, litros_usados: real
inicio
	
   escreva("Entre com o tempo da viagem.")
	leia(tempoGasto)
	
   escreva("Entre com a velocidade media.")
	leia(vMedia)
	
   distancia<-tempoGasto*vMedia
   litros_usados <- distancia/12
	
   escreva("Distancia percorrida: ",distancia,", ",litros_usados," litros")
fimalgoritmo

