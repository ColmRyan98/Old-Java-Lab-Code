import java.util.*;

public class TestBankAccount{	
	public static void main(String[] args){
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		BankAccount account1 = new BankAccount(172, 1000);
		SavingsAccount account2 = new SavingsAccount(175, 105);
		CurrentAccount account3 = new CurrentAccount(181, 75, 25);
		
		account1.setInterestRate(120);
		
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		
		System.out.println(accounts.get(0).toString());
		System.out.println(accounts.get(1).toString());
		System.out.println(accounts.get(2).toString());
		
		accounts.get(0).deposit(155);
		accounts.get(1).deposit(1000);
		accounts.get(2).deposit(10);
		
		System.out.println(accounts.get(0).toString());
		System.out.println(accounts.get(1).toString());
		System.out.println(accounts.get(2).toString());
		
		accounts.get(0).withdraw(1155);
		accounts.get(1).withdraw(1000);
		accounts.get(2).withdraw(110);
		
		System.out.println(accounts.get(0).toString());
		System.out.println(accounts.get(1).toString());
		System.out.println(accounts.get(2).toString());
		
		accounts.get(0).withdraw(10000);
		accounts.get(2).withdraw(100);
		accounts.get(1).withdraw(10000);
		
		System.out.println(accounts.get(0).toString());
		System.out.println(accounts.get(1).toString());
		System.out.println(accounts.get(2).toString());
	}
}