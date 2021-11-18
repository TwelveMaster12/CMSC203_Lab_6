
public class CheckingAccount extends BankAccount {
	//fields
	final double FEE = 0.15;
	
	//methods
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		setAccountNumber(getAccountNumber() + "-10");
		
	}
	public boolean withdraw(double amount) {
		boolean completed;
		completed = super.withdraw(amount + FEE);
		
		return completed;
	}
}
