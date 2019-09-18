import java.util.Scanner;

public class Exercise2_25
{
	public static void main(String[] args) {
		String prompt = "Please enter your name: ";
		String name = "";
		double hours = 0;
		double rate = 0;
		double fedtax = 0;
		double statetax = 0;
		double grosspay = 0;
		double fedtaxamount = 0;
		double statetaxamount = 0;
		double totaltax = 0;
		double netpay = 0;
		
		System.out.println(prompt);
		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		
		prompt = "Please enter how many hours you worked in decimal form (E.g. 10 hours, 30 minutes = 10.5): ";
		System.out.println(prompt);
		hours = input.nextDouble();
		
		prompt = "Please enter your hourly pay rate in decimal form: ";
		System.out.println(prompt);
		rate = input.nextDouble();
		
		prompt = "Please enter your federal tax withholding rate in decimal form(e.g. 20% is 0.20): ";
		System.out.println(prompt);
		fedtax = input.nextDouble();
		
		prompt = "Please enter your state tax withholding rate in decimal form(e.g. 9% is 0.09): ";
		System.out.println(prompt);
		statetax = input.nextDouble();
		
		grosspay = rate * hours;
		fedtaxamount = grosspay * fedtax;
		statetaxamount = grosspay * statetax;
		totaltax = fedtaxamount + statetaxamount;
		netpay = grosspay - totaltax;
		fedtax = fedtax*100;
		statetax = statetax*100;
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + rate);
		System.out.println("Gross Pay: $" + grosspay);
		System.out.println("Deductions: ");
		System.out.println("Federal Withholding (" + fedtax + "%): $" + fedtaxamount);
		System.out.println("State Withholding (" + statetax + "%): $" + statetaxamount);
		System.out.println("Total Deduction: $" + totaltax);
		System.out.println("Net Pay: $" + netpay);
	}
}	