import java.util.ArrayList;
import java.io.*;

public class ColorableTest
{
	public static void main(String[] args)
	{
		Rectangle o1 = new Rectangle(5,5);
		Circle o2 = new Circle(1.5);
		Square o3 = new Square(4);
		Square o4 = new Square(10);
		Rectangle o5 = new Rectangle(2,4);
		
		ArrayList test = new ArrayList<GeometricObject>();
		test.add(o1);
		test.add(o2);
		test.add(o3);
		test.add(o4);
		test.add(o5);
		
		
		for (int i = 0; i < 5; i++)
		{
			try
			{
				((Colorable)test.get(i)).howToColor();
			}
			catch(Exception ex)
			{
				System.out.println("Object is not colourable.");
			}
		}
	}
}