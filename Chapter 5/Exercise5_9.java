public class Exercise5_9
{
	public static void main(String[] args) {
		double meters1 = 20.0;
		double meters2 = 25.0;
		double meters3 = 60.0;
		double meters4 = 65.0;
		double feet1 = 1.0;
		double feet2 = 2.0;
		double feet3 = 9.0;
		double feet4 = 10.0;
		double result = 0;
		
		result = meterToFoot(meters1);
		System.out.println(meters1 + " meters is equal to " + result + " feet");
		result = meterToFoot(meters2);
		System.out.println(meters2 + " meters is equal to " + result + " feet");
		result = meterToFoot(meters3);
		System.out.println(meters3 + " meters is equal to " + result + " feet");
		result = meterToFoot(meters4);
		System.out.println(meters4 + " meters is equal to " + result + " feet");
		
		result = footToMeter(feet1);
		System.out.println(feet1 + " feet is equal to " + result + " meters");
		result = footToMeter(feet2);
		System.out.println(feet2 + " feet is equal to " + result + " meters");
		result = footToMeter(feet3);
		System.out.println(feet3 + " feet is equal to " + result + " meters");
		result = footToMeter(feet4);
		System.out.println(feet4 + " feet is equal to " + result + " meters");
	}
	
	public static double meterToFoot(double meter){
		double convert = meter * 3.279;
		return convert;
	}
	
	public static double footToMeter(double foot){
		double convert = foot * 0.305;
		return convert;
	}
}