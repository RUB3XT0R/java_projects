package exercicio26;

import java.util.Random;

import javax.swing.JOptionPane;

/*
 * Os  computadores  est�o  desempenhando  um  crescente  papel  na  educa��o.  
 * Escreva um  programa  que  ajudar�  um  estudante  do  ensino fundamental a 
 * aprender multiplica��o.  Utilize um  objeto Random para produzir dois inteiros 
 * positivos de  um algarismo.  O programa ent�o deve fazer ao  usu�rio  uma  
 * pergunta, como  Quanto � 6 vezes 7?  O aluno  insere ent�o a resposta.  
 * Em seguida,  o programa verifica a resposta do aluno . Se  estiver correta, 
 * exiba a mensagem" Muito Bom! "  e la�a outra pergunta de  multiplica��o. 
 * Se  a resposta estiver errada, exiba a mensagem  "N�o, por favor tente de novo. " 
 * e deixe  que  o estudante tente a mesma  pergunta repetidamente  at�  por  fim  
 * responder  corretamente.  Um  m�todo  separado  deve  ser  utilizado  para  gerar  
 * cada  nova  pergunta.  Esse  m�todo  deve  ser chamado  uma  vez  quando a aplica��o 
 * inicia a execu��o e toda vez  que  o usu�rio responde � pergunta corretamente 
 * */

public class MultiCAI {

	private Random r = new Random();
	
	public void makeQuestion(){
		int num1 = r.nextInt(10);
		int num2 = r.nextInt(10);
		do{
			
			int resp = Integer.parseInt(JOptionPane.showInputDialog(null,"Quanto � "+num1+" vezes "+num2+" ?"));
			if(resp==(num1*num2)) {
				JOptionPane.showMessageDialog(null,"Muito Bom!");
				break;
			}else JOptionPane.showMessageDialog(null,"N�o, por favor Tente de novo.");
						
		}while(true);
	}
	
	public static void main(String args[]){
		MultiCAI m = new MultiCAI();
		
		do{
			m.makeQuestion();
			String op = JOptionPane.showInputDialog(null,"Pronto para a pr�xima? s/n");
			if (!op.equals("s")) break;
		}while(true);

		JOptionPane.showMessageDialog(null,"Obrigado por usar nosso Sistema!");
	}
	
}
