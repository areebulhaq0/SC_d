package lab9;

public final class FailedStudent {
	public final int rollNumber;
	public final String subjectName;
	public final String subjectCode;
	
		public FailedStudent(int rollNumber,String subjectCode,String SubjectName) {
			this.rollNumber=rollNumber;
			this.subjectCode=subjectCode;
			this.subjectName=subjectName;
			
			
			}
	
public int getrollNumber() {
			return rollNumber;
		}
public String getSubjectCode() {
	return subjectCode;
}
public String getSubjectName() {
	return subjectName;
}
}


