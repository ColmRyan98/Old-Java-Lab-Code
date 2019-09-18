public class TestResultTester{
	public static void main(String[] args){
		double score1 = 32.5;
		double score2 = 57;
		double score3 = 80.25;
		double score4 = 55.75;
		int number = 4;
		
		TestResult exam = new TestResult(number);
		exam.setScore(0,score1);
		exam.setScore(1,score2);
		exam.setScore(2,score3);
		exam.setScore(3,score4);
		
		System.out.println(exam.getTotal());
		System.out.println(exam.getAverage());
		System.out.println(exam.getSingleGrade(2));
		System.out.println(exam.getGrade());
	}
}