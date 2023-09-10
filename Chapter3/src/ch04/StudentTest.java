package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(12, "Lee");
		studentLee.studentAddress = "Seoul";
		
		Student studentKim = new Student(15, "Kim");
		studentKim.studentAddress = "New York";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
	System.out.println(studentLee);
	System.out.println(studentKim);
	}

}
