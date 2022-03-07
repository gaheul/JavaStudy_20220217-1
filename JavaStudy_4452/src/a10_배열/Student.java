package a10_배열;

public class Student {
	private String stundentName;
	private int studentYear;
	
	public Student() {
		
	}
	
	public Student(String stundentName, int studentYear) {
		super();
		this.stundentName = stundentName;
		this.studentYear = studentYear;
		
	
	}

	public String getStundentName() {
		return stundentName;
	}

	public void setStundentName(String stundentName) {
		this.stundentName = stundentName;
	}

	public int getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}
	
	
}
