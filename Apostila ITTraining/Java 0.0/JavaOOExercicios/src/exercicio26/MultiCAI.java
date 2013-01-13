package exercicio26;

import java.util.Random;

import javax.swing.JOptionPane;

/*
 * Os  computadores  estão  desempenhando  um  crescente  papel  na  educação.  
 * Escreva um  programa  que  ajudará  um  estudante  do  ensino fundamental a 
 * aprender multiplicação.  Utilize um  objeto Random para produzir dois inteiros 
 * positivos de  um algarismo.  O programa então deve fazer ao  usuário  uma  
 * pergunta, como  Quanto é 6 vezes 7?  O aluno  insere então a resposta.  
 * Em seguida,  o programa verifica a resposta do aluno . Se  estiver correta, 
 * exiba a mensagem" Muito Bom! "  e laça outra pergunta de  multiplicação. 
 * Se  a resposta estiver errada, exiba a mensagem  "Não, por favor tente de novo. " 
 * e deixe  que  o estudante tente a mesma  pergunta repetidamente  até  por  fim  
 * responder  corretamente.  Um  método  separado  deve  ser  utilizado  para  gerar  
 * cada  nova  pergunta.  Esse  método  deve  ser chamado  uma  vez  quando a aplicação 
 * inicia a execução e toda vez  que  o usuário responde à pergunta corretamente 
 * */

public class MultiCAI {

	private Random r = new Random();
	
	public void makeQuestion(){
		int num1 = r.nextInt(10);
		int num2 = r.nextInt(10);
		do{
			
			int resp = Integer.parseInt(JOptionPane.showInputDialog(null,"Quanto é "+num1+" vezes "+num2+" ?"));
			if(resp==(num1*num2)) {
				JOptionPane.showMessageDialog(null,"Muito Bom!");
				break;
			}else JOptionPane.showMessageDialog(null,"Não, por favor Tente de novo.");
						
		}while(true);
	}
	
	public static void main(String args[]){
		MultiCAI m = new MultiCAI();
		
		do{
			m.makeQuestion();
			String op = JOptionPane.showInputDialog(null,"Pronto para a próxima? s/n");
			if (!op.equals("s")) break;
		}while(true);

		JOptionPane.showMessageDialog(null,"Obrigado por usar nosso Sistema!");
	}
	
}
