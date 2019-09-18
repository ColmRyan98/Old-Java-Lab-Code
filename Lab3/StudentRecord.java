public class StudentRecord{
	private String studentID;
	private TestResult studentGrades;
	private String tempWord;
	
	public StudentRecord(String id){
		studentID = id;
		studentGrades = new TestResult(3);
	}
	
	public StudentRecord(String id, int i){
		studentID = id;
		studentGrades = new TestResult(i);
	}
	
	public String getStudentID(){
		return studentID;
	}
	
	public void addResult(int testID, double value){
		studentGrades.setScore(testID,value);
	}
	
	public String toString(){
		tempWord = studentID;
		for (int i = 0; i < studentGrades.length(); i++){
			tempWord = tempWord + "," + studentGrades.getScore(i);
		}
		tempWord = tempWord + "," + studentGrades.getGrade();
		return tempWord;
	}
}