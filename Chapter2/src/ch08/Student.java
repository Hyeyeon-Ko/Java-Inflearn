package ch08;

public class Student {

	int studentId;
	String studentName;
	
	Subject korean;
	Subject math;
	
	public Student(int id, String name) {
		this.studentId = id;
		this.studentName = name;
		
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKoreanSub(String name, int score) {
		korean.subjectName = name;
		korean.score = score;
	}
	
	public void setMathSub(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korean.score + math.score;
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
}
