public class Coin{ 
	private String name;
	private double value;
	private int quantity;
	
	public Coin(String aName, double aValue, int aQuantity)
	{
		name = aName;
		value = aValue;
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
	
	public double getValue()
	{
		return value;
	}
	
	public void setValue(double newValue)
	{
		value = newValue;
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
		return (name + "," + value + "," + quantity);
	}
}