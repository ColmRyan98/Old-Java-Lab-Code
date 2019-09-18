import java.time.*;
import java.util.*;

public class BankAccount{
	private int id;
	private String name;
	protected double balance;
	private static double annualInterestRate;
	private LocalDate dateCreated;
	private static double monthRate;
	protected ArrayList<Transaction> transactions;
	private String printed;
	protected Transaction tempTrans;
	
	public BankAccount(int inId, double inBalance){
		id = inId;
		balance = inBalance;
		dateCreated = LocalDate.now();
		name = "None Given";
		transactions = new ArrayList<Transaction>();
	}
	
	public BankAccount(int inId, double inBalance, String inName)
	{
		id = inId;
		balance = inBalance;
		dateCreated = LocalDate.now();
		name = inName;
		transactions = new ArrayList<Transaction>();
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int newId){
		id = newId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;	
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
	
	public void withdraw(double amount, String desc){
		balance = balance - amount;
		tempTrans = new Transaction('W', amount, balance, desc);
		transactions.add(tempTrans);
	}
	
	public void deposit(double amount, String desc){
		balance = balance + amount;
		tempTrans = new Transaction('D', amount, balance, desc);
		transactions.add(tempTrans);
	}
	
	public String toString(){
		printed = "ID: " + id + "\n";
		printed += "Name: " + name + "\n";
		printed += "Balance: " + balance + "\n";
		printed += "Annual Interest Rate: " + annualInterestRate + "\n";
		printed += "Monthly Interest Rate: " + monthRate + "\n";
		printed += "Date Created: " + dateCreated + "\n";
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