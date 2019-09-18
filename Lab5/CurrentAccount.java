public class CurrentAccount extends BankAccount{
	private double temp;
	private double overdraft;
	private String printed;
	
	public CurrentAccount(int id, double balance, double overdraftLimit){
		super(id, balance);
		overdraft = 0 - overdraftLimit;
	}
	
	public CurrentAccount(int id, double balance, String name, double overdraftLimit){
		super(id, balance, name);
		overdraft = 0 - overdraftLimit;
	}
	
	public void withdraw(double amount, String desc){
		temp = getBalance() - amount;
		if (temp >= overdraft){
			setBalance(temp);
			tempTrans = new Transaction('W', amount, getBalance(), desc);
			transactions.add(tempTrans);
		}
	}
	
	public String toString(){
		printed = "ID: " + this.getId() + "\n";
		printed += "Name: " + this.getName() + "\n";
		printed += "Balance: " + this.getBalance() + "\n";
		printed += "Overdraft Limit: " + overdraft + "\n";
		printed += "Annual Interest Rate: " + getInterestRate() + "\n";
		printed += "Monthly Interest Rate: " + getMonthlyInterestRate() + "\n";
		printed += "Date Created: " + this.getDateCreated() + "\n";
		printed += "Transactions: \n";
		printed += "\n";
		for (int i = 0; i < transactions.size(); i++)
		{
			printed += transactions.get(i).toString(); 
			printed += "\n";
		}
		return printed;
	}
}