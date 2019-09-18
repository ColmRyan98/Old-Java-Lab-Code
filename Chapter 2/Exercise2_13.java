import java.util.Scanner;

public class Exercise2_13
{
	public static void main(String[] args) {
		String prompt = "Please enter starting amount: ";
		double startnum = 0;
		double interest = 0.00417;
		double resultnum = 0;
		
		System.out.println(prompt);
		Scanner input = new Scanner(System.in);
		startnum = input.nextDouble();
		resultnum = startnum*(1 + interest);
		
		for(int i=0; i < 5; i++) {
			resultnum = (startnum + resultnum) * (1 + interest);
		}
		System.out.println("Your account balance after 6 months is: " + resultnum);
	}
}	