package exe08_CaixasDeDialogos;

import javax.swing.JOptionPane;

public class CaixasDialogos {

	public static void main(String[] args) {
		//mensagem simples
		//Padr�o
		JOptionPane.showMessageDialog(null,
				"Oi, Tudo Bem?","Comprimento",JOptionPane.INFORMATION_MESSAGE);
		//Aviso
		JOptionPane.showMessageDialog(null,
				"Oi, Tudo Bem?","Comprimento",JOptionPane.WARNING_MESSAGE);
		//Erro
		JOptionPane.showMessageDialog(null,
				"Oi, Tudo Bem?","Comprimento",JOptionPane.ERROR_MESSAGE);
		//Sem icone
		JOptionPane.showMessageDialog(null,
				"Oi, Tudo Bem?","Comprimento",JOptionPane.PLAIN_MESSAGE);
	
		//Recebendo um numero
		String s = JOptionPane.showInputDialog(null,
				"Entre com um n�mero.",
				"Aviso",
				JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null,
				"Voc� digitou: "+s,"Aviso",JOptionPane.INFORMATION_MESSAGE);
		
		//confirma��es
		int n;
		n = JOptionPane.showConfirmDialog(null,
				"Voc� gosta de panquecas?",
				"Uma Quest�o",
				JOptionPane.YES_NO_CANCEL_OPTION);
		n = JOptionPane.showConfirmDialog(null,
				"Voc� gosta de panquecas?",
				"Uma Quest�o",
				JOptionPane.OK_CANCEL_OPTION);
		n = JOptionPane.showConfirmDialog(null,
				"Voc� gosta de panquecas?",
				"Uma Quest�o",
				JOptionPane.YES_NO_OPTION);
		JOptionPane.showMessageDialog(null,
				"Voc� "+((n==1)? "n�o" : "" )+" gosta de panquecas",
				"Aviso",JOptionPane.INFORMATION_MESSAGE);
		
		Object[] options = {"Sim, por favor", "N�o mesmo!"};
		n = JOptionPane.showOptionDialog(null,
				"Gostaria de ovos?", 
				"Uma simples pergunta.", 
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options, options[0]);
		
		//op��es com caixa de sele��o
		String[] opcoes = {"banana","caqui","caju","ma��"};
		String escolhido =  (String) JOptionPane.showInputDialog(null,
							"Seleciona uma fruta que voc� goste",
							"Frutas",
							JOptionPane.QUESTION_MESSAGE,
							null,
							opcoes, opcoes[0]);
		JOptionPane.showMessageDialog(null,
				"Voc� gosta de "+escolhido,
				"Aviso",JOptionPane.INFORMATION_MESSAGE);
	}

}
