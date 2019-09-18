public class StudentRecordTester{
	public static void main(String[] args){
		double score1 = 32.5;
		double score2 = 57;
		double score3 = 80.25;
		double score4 = 55.75;
		int number = 4;
		String id = "120456";
		String id2 = "Potato";
		
		StudentRecord exam = new StudentRecord(id, number);
		exam.addResult(0,score1);
		exam.addResult(1,score2);
		exam.addResult(2,score3);
		exam.addResult(3,score4);
		
		System.out.println(exam.getStudentID());
		System.out.println(exam.toString());
		
		StudentRecord newExam = new StudentRecord(id2);
		newExam.addResult(2,score3);
		newExam.addResult(1,score3);
		newExam.addResult(0,score3);
		
		System.out.println(newExam.getStudentID());
		System.out.println(newExam.toString());
	}
}