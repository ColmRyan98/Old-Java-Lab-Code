public class Operator{ 
	private String name;
	private String code;
	
	public Operator(String aName, String aCode)
	{
		name = aName;
		code = aCode;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getCode()
	{
		return code;
	}
	
	public String toString()
	{
		return (name + "," + code);
	}
}