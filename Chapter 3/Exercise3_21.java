import java.util.Scanner;

public class Exercise3_21
{
	public static void main(String[] args) {
		int yearnum = 0;
		int monthnum = 0;
		int daynum = 0;
		int century = 0;
		int yearofcent = 0;
		int result = 0;
		Scanner input = new Scanner(System.in);
		String prompt = "Please enter a year: ";
		System.out.println(prompt);
		yearnum = input.nextInt();
		prompt = "Please enter a month (1-12): ";
		System.out.println(prompt);
		monthnum = input.nextInt();
		prompt = "Please enter a day of the month (1-31): ";
		System.out.println(prompt);
		daynum = input.nextInt();
		
		if (monthnum > 1 && monthnum < 13) {
			if (daynum > 1 && daynum < 32) {
				century = yearnum/100;
				yearofcent = yearnum%100;
		
				if (monthnum == 1) {monthnum = 13;}
				else {
				if (monthnum == 2) {monthnum = 14;}
				};
		
				result = (daynum + ((26 * (monthnum +1 )) / 10) + yearofcent + (yearofcent / 4) + (century / 4) + (5 * century));
				result = result % 7;
				
				switch (result) {
					case 0: prompt = "Day of the week is Saturday";
							break;
					case 1: prompt = "Day of the week is Sunday";
							break;
					case 2: prompt = "Day of the week is Monday";
							break;
					case 3: prompt = "Day of the week is Tuesday";
							break;
					case 4: prompt = "Day of the week is Wednesday";
							break;
					case 5: prompt = "Day of the week is Thursday";
							break;
					case 6: prompt = "Day of the week is Friday";
							break;
					default: prompt = "Calculation Error, Exiting";
							break;
					}
			}
				else { prompt = "Invalid day of the month entered. Exiting."; }
		}
			else { prompt = "Invalid month number entered. Exiting."; }
		System.out.println(prompt);
		
	}
}