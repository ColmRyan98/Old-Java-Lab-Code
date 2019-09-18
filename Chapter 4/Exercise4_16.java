import java.util.Scanner;

public class Exercise4_16
{
	public static void main(String[] args) {
		int number = 0;
		String result = "";
		String check = "";
		Scanner input = new Scanner(System.in);
		String prompt = "Please enter a whole number:";
		System.out.print(prompt);
		number = input.nextInt();
		
		for (int i = 2; i < number; i++)
		{
			while (number%i == 0)
			{
				check = i + "";
				if (result.contains(check) != true)
				{ 
					result += i + " ";
				}
				number = number/i;
			}
		}
		if (number > 2) 
		{
			check = number + "";
			if (result.contains(check) != true)
			{ 
				result += number + " ";
			}
		}
		System.out.println(result);
	}
}