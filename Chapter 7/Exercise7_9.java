import java.util.Scanner;

public class Exercise7_9
{
	public static void main(String[] args) {
		int player = 0;
		int posrow = 0;
		int poscol = 0;
		int victory = 2;
		String vicprompt = "";
		boolean badmove = false;
		boolean correct = false;
		boolean over = false;
			String[][] board = {
								{" "," "," "},
								{" "," "," "},
								{" "," "," "}
								};
		String tablerowline = "_______"; // Only need 1 string with the line and then can just the line multipe times
		String tablerowspaces1 = "|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|";
		String tablerowspaces2 = "|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|";
		String tablerowspaces3 = "|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|";
	
		System.out.println(tablerowline + "\n" + tablerowspaces1 + "\n" + tablerowline + "\n" + tablerowspaces2 + "\n" + tablerowline + "\n" + tablerowspaces3 + "\n" + tablerowline);
		String prompt = "";
		Scanner input = new Scanner(System.in);
		//Core loop of game starts here
		while ( over == false )
		{
			correct = false;
			//Takes in what column the player wants
			prompt = "Please enter the column number you wish to place in(0, 1, 2): ";
			while (correct == false) {
			System.out.print(prompt);
			poscol = input.nextInt();
			if (poscol >= 0 && poscol < 3)
			{
				correct = true;
			}
			else{System.out.println("Incorrect number please choose a number from 0 to 2.");};
			}
			
			correct = false;
			prompt = "Please enter the row number you wish to place in(0, 1, 2): ";
			//Takes in what row the player wants
			while (correct == false) {
			System.out.print(prompt);
			posrow = input.nextInt();
			if (posrow >= 0 && posrow < 3)
			{
				correct = true;
			}
			else{System.out.println("Incorrect number please choose a number from 0 to 2.");};
			}
			
			badmove = false;
			
			//Checks if move is valid and places piece
			if (board[posrow][poscol] != " ") 
			{
				System.out.println("Invalid move, please select a different space");
				badmove = true;
			}
			else 
			{
				if (player == 0){board[posrow][poscol] = "X";}
				else {board[posrow][poscol] = "O";}
				badmove = false;
			}
			
			//Continues if move was a success
			if (badmove == false)
			{
				//Reprints the table
				tablerowspaces1 = "|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|";
				tablerowspaces2 = "|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|";
				tablerowspaces3 = "|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|";
				System.out.println(tablerowline + "\n" + tablerowspaces1 + "\n" + tablerowline + "\n" + tablerowspaces2 + "\n" + tablerowline + "\n" + tablerowspaces3 + "\n" + tablerowline);
			
				// Checks if there is any victory or draw conditions met
				String piece = "X";
				String otherPiece = "O";
				int fullRows = 0;
				if (player == 1){piece = "O"; otherPiece = "X";};
		
				for (int i = 0; i < 3; i++)
				{
					if (over == false && board[i][0] == piece && board[i][1] == piece && board[i][2] == piece) {victory = player; over = true;}
				}
				
				for (int j = 0; j < 3; j++)
				{
					if (over == false && board[0][j] == piece && board[1][j] == piece && board[2][j] == piece) {victory = player; over = true;}
				}
		
				if ((over == false && board[0][0] == piece && board[1][1] == piece && board[2][2] == piece) || (board[0][2] == piece && board[1][1] == piece && board[2][0] == piece))
				{victory = player; over = true;}
		
				for (int m = 0; m < 3; m++)
				{
					if ((over == false && board[m][0] == piece || board[m][0] == otherPiece) && (board[m][1] == piece || board[m][1] == otherPiece) && (board[m][2] == piece || board[m][2] == otherPiece)) {fullRows++;}
				}
				if (over == false) 
				{
					if (fullRows >= 3) {victory = 2; over = true;}
					else {over = false;}
				}
			
				//Changes whos turn it is
				if (over == false)
				{
					if (player == 1) {player = 0;}
					else {player = 1;}
				}
				else 
				{
					//Sets the victory message
					switch(victory) {
						case 0: vicprompt = "Player X has won the game.";
								break;
						case 1: vicprompt = "Player O has won the game.";
								break;
						case 2: vicprompt = "The board is full. The game is a draw.";
								break;
						default: vicprompt = "Not sure what you did but you broke it. Well done.";
								break;
					}
				}
			}
		}
		//Game Ends, Message is displayed
		System.out.println(vicprompt);
	}
}