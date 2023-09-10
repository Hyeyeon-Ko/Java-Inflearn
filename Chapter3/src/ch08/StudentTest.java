package ch08;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		Student studentKim = new Student(101, "Kim");
		
		studentLee.setKoreanSub("국어", 100);
		studentLee.setMathSub("수학", 95);
		
		studentKim.setKoreanSub("국어", 80);
		studentKim.setMathSub("수학", 99);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}
