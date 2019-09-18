import java.util.Scanner;

public class Exercise6_13
{
	public static void main(String[] args) {
		int excluder = 0;
		int excluder2 = 0;
		int excluder3 = 0;
		int returned = 0;
		String prompt = "Please enter the whole number you wish to exclude: ";
		Scanner input = new Scanner(System.in);
		System.out.print(prompt);
		excluder = input.nextInt();
		prompt = "Please enter the second whole number you wish to exclude: ";
		System.out.print(prompt);
		excluder2 = input.nextInt();
		prompt = "Please enter the third whole number you wish to exclude: ";
		System.out.print(prompt);
		excluder3 = input.nextInt();
		
		returned = getRandom(excluder, excluder2, excluder3);
		
		System.out.println("The random number that was generated between 1 and 54 was " + returned);
	}
	
	public static int getRandom(int ... numbers) {
		int result = (int)((Math.random()*54)+1);
		int size = numbers.length;
		for (int i = 0; i < size; i++)
		{
			if (result == numbers[i]) {result = getRandom(numbers);}
		}
		return result;
	}
}