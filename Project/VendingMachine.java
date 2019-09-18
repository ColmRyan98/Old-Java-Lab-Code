import java.util.*;
import java.io.*;

public class VendingMachine{
	private ArrayList<Operator> ops;
	private Operator tempOps;
	private ArrayList<Coin> coins;
	private Coin tempCoin;
	private ArrayList<Stock> stocks;
	private Stock tempStock;
	private ArrayList<String> copyList;
	private Scanner input;
	private File file;
	private String pattern;
	private String readLine;
	private FileWriter save;
	private String temp1;
	private String temp2;
	private String temp3;
	
	//Construction and Loading
	public VendingMachine() throws IOException
	{
		ops = new ArrayList<Operator>();
		coins = new ArrayList<Coin>();
		stocks = new ArrayList<Stock>();
		initialiseOperators();
		initialiseCoins();
		initialiseStocks();
	}
	
	//Initialisation Methods
	private void initialiseOperators() throws IOException
	{
		file = new File("Operators.txt");
		input = new Scanner(file);
		if(file.exists() == true)
		{
			while (input.hasNextLine())
			{
				readLine = input.nextLine();
				if(readLine == "")
				{
					if (input.hasNextLine())
					{
						readLine = input.nextLine();
					}
				}
				else
				{
					temp1 = readLine.substring(0,(readLine.indexOf(',')));
					temp2 = readLine.substring(((readLine.indexOf(','))+1));
					tempOps = new Operator(temp1,temp2);
					ops.add(tempOps);
				}
			}
			input.close();
		}
		else
		{
			System.out.println("File not located. Cancelling action.");
		}
	}
	
	private void initialiseCoins() throws IOException
	{
		file = new File("Coins.txt");
		input = new Scanner(file);
		if(file.exists() == true)
		{
			while (input.hasNextLine())
			{
				readLine = input.nextLine();
				if(readLine == "")
				{
					if (input.hasNextLine())
					{
						readLine = input.nextLine();
					}
				}
				else
				{
					temp1 = readLine.substring(0,(readLine.indexOf(',')));
					temp2 = readLine.substring(((readLine.indexOf(','))+1),(readLine.lastIndexOf(',')));
					temp3 = readLine.substring(((readLine.lastIndexOf(','))+1));
					tempCoin = new Coin(temp1,Double.parseDouble(temp2),Integer.parseInt(temp3));
					coins.add(tempCoin);
				}
			}
		}
		else
		{
			System.out.println("File not located. Cancelling action.");
		}
		input.close();
	}
	
	private void initialiseStocks() throws IOException
	{
		file = new File("Stocks.txt");
		input = new Scanner(file);
		if(file.exists() == true)
		{
			while (input.hasNextLine())
			{
				if(readLine == "")
				{
					if (input.hasNextLine())
					{
						readLine = input.nextLine();
					}
				}
				else
				{
					readLine = input.nextLine();
					temp1 = readLine.substring(0,(readLine.indexOf(',')));
					temp2 = readLine.substring(((readLine.indexOf(','))+1),(readLine.lastIndexOf(',')));
					temp3 = readLine.substring(((readLine.lastIndexOf(','))+1));
					tempStock = new Stock(temp1,Double.parseDouble(temp2),Integer.parseInt(temp3));
					stocks.add(tempStock);
				}
			}
		}
		else
		{
			System.out.println("File not located. Cancelling action.");
		}
		input.close();
	}
	//To get the arraylists for external use
	public ArrayList<Stock> getStocks()
	{
		return stocks;
	}
	
	public ArrayList<Coin> getCoins()
	{
		return coins;
	}
	
	public ArrayList<Operator> getOperators()
	{
		return ops;
	}
	//File Writer
	public void writeToFile(String addLine, String fileName) throws IOException
	{
		file = new File(fileName);
		if (file.exists() == true)
		{
			save = new FileWriter(fileName, true);
			save.write(addLine + "\r\n");
			save.close();
		}
		else
		{System.out.println("Invalid File Given. Please ensure file extension is included in the string");
		}
	}
	//Add New Stuff
	public void addStockByObject(Stock newStock) throws IOException
	{
		stocks.add(newStock);
		writeToFile(newStock.toString(),"Stocks.txt");
	}
	
	public void addStockByValues(String newId, double newPrice, int newQuantity) throws IOException
	{
		tempStock = new Stock(newId, newPrice, newQuantity);
		stocks.add(tempStock);
		writeToFile(tempStock.toString(),"Stocks.txt");
	}
	
	public void addCoinByObject(Coin newCoin) throws IOException
	{
		coins.add(newCoin);
		writeToFile(newCoin.toString(),"Coins.txt");
	}
	
	public void addCoinByValues(String newId, double newValue, int newQuantity) throws IOException
	{
		tempCoin = new Coin(newId, newValue, newQuantity);
		coins.add(tempCoin);
		writeToFile(tempCoin.toString(),"Coins.txt");
	}
	
	public void addOperatorByObject(Operator newOp) throws IOException
	{
		ops.add(newOp);
		writeToFile(newOp.toString(),"Operators.txt");
	}
	
	public void addOperatorByValues(String newId, String newCode) throws IOException
	{
		tempOps = new Operator(newId, newCode);
		ops.add(tempOps);
		writeToFile(tempOps.toString(),"Operators.txt");
	}
	//Removes and rewrites the file
	public void removeFromFile(String search, String fileName) throws IOException
	{
		file = new File(fileName);
		if(file.exists() == true)
		{
			copyList = new ArrayList<String>();
			input = new Scanner(file);
			while(input.hasNextLine() == true)
			{
				readLine = input.nextLine();
				pattern = readLine.substring(0,readLine.indexOf(','));
				if(search.contains(pattern) != true)
				{
					copyList.add(readLine);
				}
			}
			input.close();
			save = new FileWriter(fileName,false);
			save.write(copyList.get(0) + "\r\n");
			save.close();
			for(int a = 1; a < copyList.size(); a++)
			{
				writeToFile(copyList.get(a),fileName);
			}
		}
		else
		{
			System.out.println("Invalid File. Please make sure to include file extension.");
		}
	}
}