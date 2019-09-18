public class SavingsAccount extends BankAccount{
	private double temp;
	private String printed;
	
	public SavingsAccount(int id, double balance){
		super(id, balance);
	}
	
	public SavingsAccount(int id, double balance, String name){
		super(id, balance, name);
	}
	
	public void withdraw(double amount, String desc){
		temp = getBalance() - amount;
		if (temp >= 0){
			setBalance(temp);
			tempTrans = new Transaction('W', amount, getBalance(), desc);
			transactions.add(tempTrans);
		}
	}
	
	public String toString(){
		printed = "ID: " + this.getId() + "\n";
		printed += "Name: " + this.getName() + "\n";
		printed += "Balance: " + this.getBalance() + "\n";
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