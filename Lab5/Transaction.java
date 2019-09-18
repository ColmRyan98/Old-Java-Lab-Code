import java.time.*;

public class Transaction{
	private double amount;
	private char type;
	private LocalDate date;
	private double balance;
	private String description;
	private String printed;
	
	public Transaction(char inType, double inAmount, double inBalance, String inDesc){
		date = LocalDate.now();
		type = inType;
		amount = inAmount;
		balance = inBalance;
		description = inDesc;
		
		printed = "";
	}
	
	public String toString()
	{
		printed = "Date of Transaction: " + date + "\n";
		printed += "Type: " + type + "\n";
		printed += "Amount: " + amount + "\n";
		printed += "New Balance: " + balance + "\n";
		printed += "Description: " + description + "\n";
		return printed;
	}
}