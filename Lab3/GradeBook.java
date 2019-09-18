import java.util.*;

public class GradeBook{
	private String bookName;
	private int numberOfTests;
	private ArrayList<StudentRecord> resultsTable;
	private int counter;
	private boolean isContained;
	private StudentRecord objectAdder;
	private String returner;
	
	public GradeBook(String name, int i){
		bookName = name;
		numberOfTests = i;
		resultsTable = new ArrayList<StudentRecord>();
		counter = 0;
		isContained = false;
		returner = "Error, no results";
	}
	
	public void addStudentResult(String id, int testId, double value){
		isContained = false;
		counter = 0;
		for (int j = 0; j < resultsTable.size() && isContained == false; j++){
			if (id == resultsTable.get(j).getStudentID()) {
				isContained = true;
			}
			else {isContained = false; counter++;}
		}
		if (isContained == true){
			resultsTable.get(counter).addResult(testId, value);
		}
		else {
			objectAdder = new StudentRecord(id, numberOfTests);
			resultsTable.add(objectAdder);
			resultsTable.get((resultsTable.size() - 1)).addResult(testId, value);
		}
	}
	
	public String toString(){
		returner = "";
		for(int k = 0; k < resultsTable.size(); k++){
			returner = returner + resultsTable.get(k).toString() + "\n";
		}
		return returner;
	}
}