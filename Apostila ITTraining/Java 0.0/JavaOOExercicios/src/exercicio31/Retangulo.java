package exercicio31;


/*
 *(Classe  Retângulo)  Crie uma  classe  Retangulo. A classe  tem  atributos length e width, 
 *cada um  dos  quais  é configurado com o padrão 1. A classe  deve  ter  métodos  que  
 *calculam  o perímetro  (perimeter) e a área  (area)  do  retângulo.  A classe  tem  métodos  
 *set  e get  para  o comprimento (length) e a largura (width). Os  métodos ser devem  verificar 
 *se length e width são, cada um,  números de  ponto flutuante  maiores que 0,0 e menores que  20,0.  
 *Escreva  um  programa para testar a classe Rectangle.
 * */

public class Retangulo {
	
	private float length=1;
	private float width=1;
	
	public float getPerimetro(){
		return 2*(length+width);
	}
	
	public float getArea(){
		return length*width;		
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		if(length>0.0 && length<20.0) this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		if(width>0.0 && width<20.0)  this.width = width;
	}
	
	
}
