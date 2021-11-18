
public class SavingsAccount extends BankAccount {
	
	//fields 
	double rate = 0.025;
	int savingsNumber = 0;
	private String accountNumber;
	//constructors
	public SavingsAccount(String name, double balance) {
		super(name, balance);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	//copy
	public SavingsAccount(SavingsAccount s, double balance) {
		super(s,balance);
		savingsNumber++;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	//methods 
	public void postInterest() {
		super.deposit((super.getBalance() * rate)/ 12);
	}
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
	
}
