public class ObjectMaxTest
{
	public static void main(String[] args)
	{
		Rectangle o1 = new Rectangle(5,5);
		Circle o2 = new Circle(1.5);
		
		System.out.println("Rectangle Area: " + o1.getArea());
		System.out.println("Circle Area: " + o2.getArea());
		
		System.out.println("The larger object is " + (o1.max(o1 , o2)).toString());
	}
}