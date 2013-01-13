package exercicio32;

/*
 * (Classe Conta de poupança)  Crie uma classe SavingsAccount.  
 * Utilize uma variáveis static annualInterestRate para armazenar a taxa de juros anual  
 * para  todos os  correntistas. Cada  objeto  da  classe contém uma variável  de  
 * instância  private savingsBalance para indicar a quantidade que  o poupador  atualmente  
 * tem  em  depósito.  Forneça  um  método  calculateMonthlyInterest  para  calcular  os  
 * juros  mensais  multiplicando savingsBalance por annualInterestRate e dividindo por  12 - 
 * esses juros devem ser adicionados a savingsBalance.  Forneça um  método static modifyInterestRate  
 * que  configure  annualInterestRate  com  um  novo  valor.  
 * */

public class SavingAccount {
	
	private static float annualInterestRate;
	private float savingsBalance;
	
	public float calculateMonthlyInterest(){
		savingsBalance += annualInterestRate*savingsBalance/12;
		return savingsBalance;
	}
	
	public void modifyInterestRate(float annualInterestRate){
		if(annualInterestRate>=0.0)	this.annualInterestRate=annualInterestRate;
	}

	public static float getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(float annualInterestRate) {
		SavingAccount.annualInterestRate = annualInterestRate;
	}

	public float getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(float savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	
}
