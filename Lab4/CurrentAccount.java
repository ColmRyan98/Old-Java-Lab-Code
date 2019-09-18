public class CurrentAccount extends BankAccount{
	private double temp;
	private double overdraft;
	private String printed;
	
	public CurrentAccount(int id, double balance, double overdraftLimit){
		super(id, balance);
		overdraft = 0 - overdraftLimit;
	}
	
	public void withdraw(double amount){
		temp = getBalance() - amount;
		if (temp >= overdraft){
			setBalance(temp);
		}
	}
	
	public String toString(){
		printed = "ID: " + this.getId() + "\n";
		printed += "Balance: " + this.getBalance() + "\n";
		printed += "Overdraft Limit: " + overdraft + "\n";
		printed += "Annual Interest Rate: " + getInterestRate() + "\n";
		printed += "Monthly Interest Rate: " + getMonthlyInterestRate() + "\n";
		printed += "Date Created: " + this.getDateCreated() + "\n";
		return printed;
	}
}