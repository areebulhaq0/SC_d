package lab9;

public class PromotedStudent {

	public int rollNumber;
	public String subjectCode;
	public String subjectName;
	
	public PromotedStudent(int rollNumber , String subjectCode , String subjectName) {
		
		this.rollNumber = rollNumber;
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
	}
	
	int getRollNumber() {
		return rollNumber;
	}
	
	String getSubjectCode() {
		return subjectCode;
	}
	String getSubjectName() {
		return subjectName;
	}
	
	void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
}


