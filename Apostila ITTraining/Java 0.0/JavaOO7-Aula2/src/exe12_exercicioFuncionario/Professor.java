package exe12_exercicioFuncionario;

import javax.swing.JOptionPane;

public class Professor extends Funcionario {

	public double qtdeHoras;
	public double vlHoras;
	
	@Override
	public String getProfissao() {return "Professor";}

	@Override
	public Double calcularSalario() {return qtdeHoras* vlHoras;}

	@Override
	public void preencher() {
		qtdeHoras = Double.parseDouble(
				JOptionPane.showInputDialog(null,
						"Entre com a quantidade de horas.",
						"Cadastro Professor",
						JOptionPane.QUESTION_MESSAGE));
		vlHoras = Double.parseDouble(
				JOptionPane.showInputDialog(null,
						"Entre com o valor de horas.",
						"Cadastro Professor",
						JOptionPane.QUESTION_MESSAGE));
	}

}



