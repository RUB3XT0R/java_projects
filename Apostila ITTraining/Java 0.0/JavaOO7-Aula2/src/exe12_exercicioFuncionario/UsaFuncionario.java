package exe12_exercicioFuncionario;

import javax.swing.JOptionPane;

public class UsaFuncionario {

	public static void main(String[] args) {
		//criamos um funcionario
		Funcionario[] funcionarios = new Funcionario[2];
		//vetor das op��es pra o nosso InputDialog
		String[] opcoes ={"Professor","Motorista","Vendedor"};
		
		String op; 
		for(int i=0; i< funcionarios.length; i++){
			//recebendo a op��o desejada
			op = (String) JOptionPane.showInputDialog(null, 
							"Entre com uma op��o.", "Cadastro Funcionario", 
							JOptionPane.QUESTION_MESSAGE,null,opcoes,"Professor");
			
			//verificando a op��o
			if(opcoes[0].equals(op)) funcionarios[i] = new Professor();
			else if(opcoes[1].equals(op)) funcionarios[i] = new Motorista();
		    else if(opcoes[2].equals(op)) funcionarios[i] = new Vendedor();

			//preenchendo o funcionario.
			funcionarios[i].preencher();
		}
		
		//mostrando os funcionario
		op="";
		for(Funcionario f : funcionarios){
			op+= f.getProfissao()+", ganhe R$"+f.calcularSalario()+"\n";			
		}
		JOptionPane.showMessageDialog(null,op);	
		
	}

}

