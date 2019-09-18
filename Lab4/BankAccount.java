import java.time.*;

public class BankAccount{
	private int id;
	protected double balance;
	private static double annualInterestRate;
	private LocalDate dateCreated;
	private static double monthRate;
	private String printed;
	
	public BankAccount(int inId, double inBalance){
		id = inId;
		balance = inBalance;
		dateCreated = LocalDate.now();
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int newId){
		id = newId;
	}
	
	public double getBalance(){
		return balance;
	}

	public void setBalance(double newBalance){
		balance = newBalance;
	}
	
	public static double getInterestRate(){
		return annualInterestRate;
	}
	
	public static void setInterestRate(double newInterestRate){
		annualInterestRate = newInterestRate;
		monthRate = annualInterestRate / 12;
	}
	
	public LocalDate getDateCreated(){
		return dateCreated;
	}
	
	public static double getMonthlyInterestRate(){
		monthRate = annualInterestRate/12;
		return monthRate;
	}
	
	public void withdraw(double amount){
		balance = balance - amount;
	}
	
	public void deposit(double amount){
		balance = balance + amount;
	}
	
	public String toString(){
		printed = "ID: " + id + "\n";
		printed += "Balance: " + balance + "\n";
		printed += "Annual Interest Rate: " + annualInterestRate + "\n";
		printed += "Monthly Interest Rate: " + monthRate + "\n";
		printed += "Date Created: " + dateCreated + "\n";
		return printed;
	}
}