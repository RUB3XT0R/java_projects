package exercicio31;


/*
 *(Classe  Ret�ngulo)  Crie uma  classe  Retangulo. A classe  tem  atributos length e width, 
 *cada um  dos  quais  � configurado com o padr�o 1. A classe  deve  ter  m�todos  que  
 *calculam  o per�metro  (perimeter) e a �rea  (area)  do  ret�ngulo.  A classe  tem  m�todos  
 *set  e get  para  o comprimento (length) e a largura (width). Os  m�todos ser devem  verificar 
 *se length e width s�o, cada um,  n�meros de  ponto flutuante  maiores que 0,0 e menores que  20,0.  
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
