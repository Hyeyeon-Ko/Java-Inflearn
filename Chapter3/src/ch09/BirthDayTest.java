package ch09;

public class BirthDayTest {

	public static void main(String[] args) {

		BirthDay day = new BirthDay();
		day.setYear(2022);
		day.setMonth(14);
		day.setDay(3);
		
		System.out.println(day.isValid());
	}

}
