package exe05_CaixaDeDialogos;

import javax.swing.JOptionPane;

public class CaixasDialogos {

	public static void main(String[] args) {
		//mensagem simples
		JOptionPane.showMessageDialog(null,
				"Oi, Tudo Bem?","Comprimento",JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null,
				"Oi, Tudo Bem?","Comprimento",JOptionPane.WARNING_MESSAGE);
		
		JOptionPane.showMessageDialog(null,
				"Oi, Tudo Bem?","Comprimento",JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showMessageDialog(null,
				"Oi, Tudo Bem?","Comprimento",JOptionPane.PLAIN_MESSAGE);
	
		//Recebendo um numero
		String s = JOptionPane.showInputDialog(null,
				"Entre com um número.",
				"Aviso",
				JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null,
				"Você digitou: "+s,"Aviso",JOptionPane.INFORMATION_MESSAGE);
		
		//confirmações
		int n = JOptionPane.showConfirmDialog(null,
				"Você gosta de panquecas?",
				"Uma Questão",
				JOptionPane.YES_NO_OPTION);
		
		JOptionPane.showMessageDialog(null,
				"Você "+((n==1)? "não" : "" )+" gosta de panquecas",
				"Aviso",JOptionPane.INFORMATION_MESSAGE);
		
		//opções com caixa de seleção
		String[] opcoes = {"banana","caqui","caju","maçã"};
		String escolhido =  (String) JOptionPane.showInputDialog(null,
							"Seleciona uma fruta que você goste",
							"Frutas",
							JOptionPane.QUESTION_MESSAGE,
							null,
							opcoes, opcoes[0]);
		JOptionPane.showMessageDialog(null,
				"Você gosta de "+escolhido,
				"Aviso",JOptionPane.INFORMATION_MESSAGE);
	}

}
