package exercicio29;

import java.util.Random;

import javax.swing.JOptionPane;

import exercicio28.MultiCAI;


/*
 * Escreva um aplicativo que joga 'adivinhe o n�mero' como a seguir:  
 * Seu programa escolhe o n�mero a ser adivinhado selecionando  um inteiro 
 * aleat�rio no intervalo de  1 a 1.000. O aplicativo exibe o prompt 
 * �Guess a number  between  1 and  1000�  [Adivinhe  um  n�mero  entre 1 e 1. 000]. 
 * O Jogador insere uma primeira suposi��o. Se o palpite do jogador estiver incorreto,
 * seu programa deve exibir Too high.  Try again [Muito alto. Tente novamente]  ou Too low.  
 * Try again [Muito baixo.  Tente novamente]  . Para ajudar o jogador a 'zerar' mediante 
 * uma resposta correta, o programa deve  solicitar  ao  usu�rio  o pr�ximo  palpite.  
 * Quando  o usu�rio  insere  a resposta  correta,  exiba " Congratulations.  You  guessed  
 * the  number! [Parab�ns,  voc� adivinhou o n�mero !]"  e permita que o usu�rio escolha 
 * se quer jogar novamente.  
 * */

public class Adivinho {

	private Random r = new Random();
	
	public void makeNumber(){
		int num1 = r.nextInt(1000)+1; //entre 1 e 1000
		int resp = Integer.parseInt(JOptionPane.showInputDialog(null,"Advinhe o n�mero entre 1 e 1000:"));
		do{
			
		    if(resp==num1) {
					JOptionPane.showMessageDialog(null,"Parab�ns,  voc� adivinhou o n�mero !");
					break;
			}
		    resp = Integer.parseInt(JOptionPane.showInputDialog(null,
		    		(resp>num1 ? "Muito alto." : "Muito baixo." )+" Tente novamente:"));
		}while(true);
	}
	
	public static void main(String args[]){
		Adivinho a = new Adivinho();
		do{
			a.makeNumber();
			String op = JOptionPane.showInputDialog(null,"Pronto para a pr�xima rodada? s/n");
			if (!op.equals("s")) break;
		}while(true);
	}
}
