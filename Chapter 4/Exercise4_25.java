import java.util.Scanner;

public class Exercise4_25
{
	public static void main(String[] args) {
		int n = 0;
		int result = 0;
		int count = 0;
		Scanner input = new Scanner(System.in);
		String prompt = "Please enter a whole number:";
		System.out.print(prompt);
		n = input.nextInt();
		
		for (int i = 1; i <= n; i++) 
		{
			count = i;
			while (count > 0) 
			{
				result = result + count;
				count--;
			}
		}
		
		prompt = "The sum of the sequence of " + n + " terms is " + result;
		System.out.println(prompt);
	}
}