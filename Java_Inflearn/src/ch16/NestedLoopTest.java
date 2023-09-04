package ch16;

public class NestedLoopTest {

	public static void main(String[] args) {

		System.out.println("<for문 이용>"); 
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {
			
			for (times = 1; times <= 9; times++) {
				
				System.out.println(dan + " X " + times + " = " + dan*times);
			}
			System.out.println();
		}
		
		System.out.println("<while문 이용>"); 
		dan = 2;
		times = 1;
		
		while(dan <= 9) {
			times = 1;
			while(times <= 9) {
				
				System.out.println(dan + " X " + times + " = " + dan*times);
				times++;
			}
			dan++;
			System.out.println();
		}
	}

}
