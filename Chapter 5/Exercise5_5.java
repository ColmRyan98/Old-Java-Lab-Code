public class Exercise5_5
{
	public static void main(String[] args) {
		double first = 5.0;
		double second = 14.0;
		double third = 8.0;
		
		displayLargestNumber(first, second, third);
	}
	
	public static void displayLargestNumber(double num1, double num2, double num3){
		double result = num1;
		boolean biggest = false;
		while (biggest == false) 
		{
			biggest = true;
			if (num1 > result) {result = num1; biggest = false;}
			else {
				if (num2 > result) {result = num2; biggest = false;}
				else {
					if (num3 > result) {result = num3; biggest = false;}
				}
			}
		}
		System.out.println("The largest of the three numbers is " + result);
	}
}