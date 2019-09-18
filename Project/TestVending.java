import java.util.*;
import java.io.*;

public class TestVending{
	public static void main(String[] args) throws IOException
	{
		VendingMachine test = new VendingMachine();
		Stock pretsel = new Stock("Pretzel",1.85,3);
		Coin cent = new Coin("1 cent",0.01,1);
		for(int i = 0; i < (test.getOperators().size()); i++)
		{
			System.out.print(test.getOperators().get(i).toString());
		}
		System.out.println("");
		for(int i = 0; i < (test.getStocks().size()); i++)
		{
			System.out.print(test.getStocks().get(i).toString());
		}
		System.out.println("");
		for(int i = 0; i < (test.getCoins().size()); i++)
		{
			System.out.print(test.getCoins().get(i).toString());
		}
		System.out.println("");
		test.addStockByValues("Pepsi",1.30,5);
		test.addStockByObject(pretsel);
		for(int i = 0; i < (test.getStocks().size()); i++)
		{
			System.out.print(test.getStocks().get(i).toString());
		}
		System.out.println("");
		test.addCoinByValues("5 cents",0.05,3);
		test.addCoinByObject(cent);
		for(int i = 0; i < (test.getCoins().size()); i++)
		{
			System.out.print(test.getCoins().get(i).toString());
		}
		System.out.println("");
		test.removeFromFile("Pepsi","Stocks.txt");
		for(int i = 0; i < (test.getStocks().size()); i++)
		{
			System.out.print(test.getStocks().get(i).toString());
		}
		System.out.println("");
		test.removeFromFile("1 cent","Coins.txt");
		for(int i = 0; i < (test.getCoins().size()); i++)
		{
			System.out.print(test.getCoins().get(i).toString());
		} 
	}
}