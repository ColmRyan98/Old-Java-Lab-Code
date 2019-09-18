import java.util.Scanner;

public class Exercise6_15
{
	public static void main(String[] args) {
		int beans = 0;
		int slotsnum = 0;
		int counter = 0;
		int random = 0;
		String prompt = "Please enter the number of beans to drop: ";
		Scanner input = new Scanner(System.in);
		System.out.print(prompt);
		beans = input.nextInt();
		System.out.println("");
		prompt = "Please enter number of slots in the bean machine: ";
		System.out.print(prompt);
		slotsnum = input.nextInt();
		int[] slots = new int[slotsnum];
		System.out.println("");
		
		for (int i = 0; i < beans; i++) 
		{
			counter = 0;
			for (int j = 0; j < slotsnum; j++) 
			{
				random = (int)((Math.random()*2)+1);
				if (random == 1) 
				{
					System.out.print("R");
					counter++;
				}
				else {System.out.print("L");}
			}
			counter--;
			slots[counter] = (slots[counter]) + 1;
			System.out.println("");
		}
		
		System.out.println("");
		
		for (int k = beans; k > 0; k--)
		{
			for (int o = 0; o < slotsnum; o++) 
			{
				if (slots[o] >= k) {System.out.print("0");}
				else {System.out.print("-");} // "-" used in place of " " for better debugging and structure of histogram
			}
			System.out.println("");
		}
	}
}