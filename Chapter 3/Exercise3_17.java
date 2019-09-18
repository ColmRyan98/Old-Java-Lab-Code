import java.util.Scanner;

public class Exercise3_17
{
	public static void main(String[] args) {
		int player = 4;
		int computer = (int)(Math.random()*3);
		Scanner input = new Scanner(System.in);
		String prompt = "Please select enter a number for either scissors (0), rock (1), paper (2): ";
		System.out.println(prompt);
		player = input.nextInt();
		
		switch (player) {
			case 0: if (computer == 0) {prompt = "You chose Scissors. Computer chose Scissors. It is a draw.";};
					if (computer == 1) {prompt = "You chose Scissors. Computer chose Rock. Rock beats Scissors, Computer wins.";};
					if (computer == 2) {prompt = "You chose Scissors. Computer chose Paper. Scissors beats Paper, You win.";};
					break;
			case 1: if (computer == 0) {prompt = "You chose Rock. Computer chose Scissors. Rock beats Scissors, You win.";};
					if (computer == 1) {prompt = "You chose Rock. Computer chose Rock. It is a draw.";};
					if (computer == 2) {prompt = "You chose Rock. Computer chose Paper. Paper beats rock, Computer wins.";};
					break;
			case 2: if (computer == 0) {prompt = "You chose Paper. Computer chose Scissors. Scissors beats Paper, Computer wins.";};
					if (computer == 1) {prompt = "You chose Paper. Computer chose Rock. Paper beats Rock, You win.";};
					if (computer == 2) {prompt = "You chose Paper. Computer chose Paper. It is a draw.";};
					break;
			default: prompt = "Error. Invalid Input. Please input 0,1 or 2 next time to play.";
					break;	
		}
		System.out.println(prompt);
	}
}	