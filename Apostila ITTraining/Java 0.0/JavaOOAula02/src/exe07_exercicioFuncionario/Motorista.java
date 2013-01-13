package exe07_exercicioFuncionario;

import javax.swing.JOptionPane;

public class Motorista extends Funcionario {

	private double salarioFixo, qtdeHorasExtras,vlHora;
	
	@Override
	public String getProfissao() {return "Motorista";}

	@Override
	public Double calcularSalario() {
		return salarioFixo + (vlHora*qtdeHorasExtras);
	}

	@Override
	public void preencher() {
		salarioFixo = Double.parseDouble(
				JOptionPane.showInputDialog(null,
						"Entre com o salarioFixo.",
						"Cadastro Motorista",
						JOptionPane.QUESTION_MESSAGE));
		vlHora = Double.parseDouble(
				JOptionPane.showInputDialog(null,
						"Entre com a quantidade de horas trabalhadas.",
						"Cadastro Motorista",
						JOptionPane.QUESTION_MESSAGE));
		qtdeHorasExtras = Double.parseDouble(
				JOptionPane.showInputDialog(null,
						"Entre com a quantidade de horas extras.",
						"Cadastro Motorista",
						JOptionPane.QUESTION_MESSAGE));
	}

}


