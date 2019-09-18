public class Stock{ 
	private String name;
	private double price;
	private int quantity;
	
	public Stock(String aName, double aPrice, int aQuantity)
	{
		name = aName;
		price = aPrice;
		quantity = aQuantity;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double newPrice)
	{
		price = newPrice;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setQuantity(int newQuantity)
	{
		quantity = newQuantity;
	}
	
	public String toString()
	{
		return (name + "," + price + "," + quantity);
	}
}