public class TestGradeBook{
	public static void main(String[] args){
		GradeBook homeEc = new GradeBook("Home Economics", 2);
		GradeBook sheep = new GradeBook("Sheep Shearing", 1);
		
		homeEc.addStudentResult("1234", 0, 67.0);
		homeEc.addStudentResult("1234", 1, 83.5);
		homeEc.addStudentResult("5678", 1, 0.0);
		homeEc.addStudentResult("5678", 0, 17.2);
		
		sheep.addStudentResult("1234", 0, 45.7);
		sheep.addStudentResult("5678", 0, 67.4);
		sheep.addStudentResult("Joe", 0, 92.1);
		
		System.out.println(homeEc.toString());
		System.out.println(sheep.toString());
	}
}