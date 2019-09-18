/*
	Design a TestResult class that has fields to hold any amount test scores and a score/grade table
(illustrated below) which allows a total score to be converted to a grade. The score/grade
table will be the same for all objects of type TestResult. Add the following to the class:
• a method void setScore(int i, double value) that sets the score of
the ith test;
• a method double getScore(int i) that returns the score of the ith test;
• a method double getAverage() which returns the average of the test scores;
• a method double getTotal() which returns the total of the test scores;
• a method String getGrade() which returns the grade; 
*/

public class TestResult{
	private int counter;
	private boolean found;
	private double tempDoub;
	private String tempWord;
	private double scores[];
	private String grades[];
	private static String[] gradetable = {"NG","F","D2","D1","C3","C2","C1","B3","B2","B1","A2","A1"};
	private static double[] scoretable = {0,1,30,35,40,48,52,56,60,64,72,80};
	
	public TestResult(int number){
		scores = new double[number];
		grades = new String[number];
		counter = 0;
		tempDoub = 0;
		tempWord = "Error, Not a Grade";
		found = false;
	}
	
	private String calculateGrade(double convert){
		counter = 0;
		found = false;
		while (counter < 11 && found == false){
			if (convert < scoretable[counter+1] || counter == 10){
				if (convert >= scoretable[counter]){
					found = true;
					if (counter == 10) {counter = 11;}
				}
				else {
					counter++;
					found = false;
				}
			}
			else {
				counter ++;
				found = false;
			}
		}
		found = false;
		tempWord = gradetable[counter];
		return tempWord;
	}
	
	public void setScore(int i, double score){
		scores[i] = score;
		grades[i] = calculateGrade(score);
	}
	
	public double getScore(int i){
		return scores[i];
	}
	
	public double getAverage(){
		tempDoub = 0;
		for (int i = 0; i < scores.length; i++){
			tempDoub = tempDoub + scores[i];
		}
		tempDoub = tempDoub / scores.length;
		return tempDoub;
	}
	
	public double getTotal(){
		tempDoub = 0;
		for (int i = 0; i < scores.length; i++){
			tempDoub = tempDoub + scores[i];
		}
		return tempDoub;
	}
	
	public String getGrade(){
		tempWord = calculateGrade(getAverage());
		return tempWord;
	}
	
	public String getSingleGrade(int i){ /*Added due to want to use the system by which I set this up better and to allow object more versatilility*/
		tempWord = grades[i];
		return tempWord;
	}
	
	public int length(){
		return scores.length;
	}
}