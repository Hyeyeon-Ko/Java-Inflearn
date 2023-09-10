package ch04;

public class Student {

	int studentId;
	String studentName;
	String studentAddress;
	
	public Student () {}
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public void showStudentInfo() {
		System.out.println(studentId + ", " + studentName + ", " + studentAddress);
	}
	
	public String getStudentName() {
		return studentName;
	}
}
