package exercicio25;

import javax.swing.JOptionPane;

public class TesteEstacionamento {

	/**
	 *  Escreva um  aplicativo que calcule e exiba as  taxas de estacionamento para cada cliente 
	 * que estacionou nessa garagem  ontem.  Você  deve  inserir as  horas  de estacionamento 
	 * para cada  cliente.  O programa deve  exibir a cobrança para  o cliente atual  e calcular 
     * e exibir o total dos  recibos de ontem.  O programa deve utilizar o método  calculateCharges 
 	 * para determinar a cobrança para cada cliente.
	 */
	public static void main(String[] args) {
		
		float totalDia=0.0f;
		Estacionamento e = new Estacionamento();
		
		do{

			int inicio = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com a hora inicial:"));
			int fim = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com a hora inicial:"));
			e.setInicio(inicio);
			e.setFinal(fim);
			float atual = e.calculateCharges();
			totalDia += atual;
			
			JOptionPane.showMessageDialog(null,"Total do carro: R$"+atual);			
			
			String op = JOptionPane.showInputDialog(null,"Total do Dia: R$ "+totalDia+"\nDeseja continuar? s/n");
			if (!op.equals("s")) break;
		}while(true);
		
	}

}
