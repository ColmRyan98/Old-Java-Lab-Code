import java.util.Scanner;

public class Exercise7_1
{
	public static void main(String[] args) {
		double result = 0;
		String prompt = "Please enter the column number you wish to sum (0, 1, 2, 3): ";
		boolean correct = false;
		double[][] matrix = {
			{1.5, 2, 3, 4},
			{5.5, 6, 7, 8},
			{9.5, 1, 3, 1},
		};
		int index = 0;
		Scanner input = new Scanner (System.in);
		while (correct == false) {
			System.out.print(prompt);
			index = input.nextInt();
			System.out.println("");
			if (index >= 0 && index < 4)
			{
				correct = true;
			}
			else{System.out.println("Incorrect number please choose a number from 0 to 3.");};
		}
		
		result = sumColumn(matrix, index);
		prompt = "The sum of column " + index + " is " + result;
		System.out.println(prompt);
	}
	
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int i = 0; i < m.length; i++)
		{
			sum = sum + m[i][columnIndex];
		}			
		return sum;
	}
}