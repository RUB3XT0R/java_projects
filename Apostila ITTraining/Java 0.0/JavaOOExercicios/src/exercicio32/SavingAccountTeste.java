package exercicio32;

public class SavingAccountTeste {

	/**
	 * Escreva  um  programa  para  testar  
	 * a classe  SavingsAccount. Instancie dois objetos  savingsAccount, saver1 e saver2, com saldos de 
	 * $ 2.000  e $ 3.000, respectivamente. Configure annuallnterestRate como  4%  e então calcule o juro 
	 * mensal  c imprima os  novos saldos para os dois poupadores. Em seguida, configure annualInterestRate 
	 * para 5%, calcule a taxa do  próximo  mês  e imprima os  novos saldos  para os  dois  poupadores.
	 */
	public static void main(String[] args) {

		SavingAccount saver1 = new SavingAccount(),
				      saver2 = new SavingAccount();
		
		saver1.setSavingsBalance(2000);
		saver2.setSavingsBalance(3000);
		
		//não necessidade de instanciar metodos e atributos static
		SavingAccount.setAnnualInterestRate(0.04f);
		
		System.out.println("Saver 1 - Novo Saldo com Juros : R$"+saver1.calculateMonthlyInterest());
		System.out.println("Saver 2 - Novo Saldo com Juros : R$"+saver2.calculateMonthlyInterest());
	
        SavingAccount.setAnnualInterestRate(0.05f);
		
		System.out.println("Saver 1 - Novo Saldo com Juros : R$"+saver1.calculateMonthlyInterest());
		System.out.println("Saver 2 - Novo Saldo com Juros : R$"+saver2.calculateMonthlyInterest());
		
	}

}
