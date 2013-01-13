package exe12_exercicioFuncionario;

import javax.swing.JOptionPane;

public class Vendedor extends Funcionario {

	public double vlvenda,comissao;
	
	@Override
	public String getProfissao() {
		return "Vendedor";
	}

	@Override
	public Double calcularSalario() {
		return (vlvenda*comissao)/100;
	}

	@Override
	public void preencher() {
		vlvenda = Double.parseDouble(
				JOptionPane.showInputDialog(null,
						"Entre com o valor da venda.","Cadastro Vendedor",
						JOptionPane.QUESTION_MESSAGE));
		comissao = Double.parseDouble(
				JOptionPane.showInputDialog(null,
						"Entre com a comissão.","Cadastro Vendedor",
						JOptionPane.QUESTION_MESSAGE));
	}

}




