public class SavingsAccount extends BankAccount{
	private double temp;
	private String printed;
	
	public SavingsAccount(int id, double balance){
		super(id, balance);
	}
	
	public void withdraw(double amount){
		temp = getBalance() - amount;
		if (temp >= 0){
			setBalance(temp);
		}
	}
	
	public String toString(){
		printed = "ID: " + this.getId() + "\n";
		printed += "Balance: " + this.getBalance() + "\n";
		printed += "Annual Interest Rate: " + getInterestRate() + "\n";
		printed += "Monthly Interest Rate: " + getMonthlyInterestRate() + "\n";
		printed += "Date Created: " + this.getDateCreated() + "\n";
		return printed;
	}
}