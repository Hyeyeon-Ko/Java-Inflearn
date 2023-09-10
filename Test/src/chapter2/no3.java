package chapter2;

public class no3 {

	public static void main(String[] args) {

		int dan;
		int times;
		
		//1번쨰 방법: for문 안에 조건문 걸어주기 
		for (dan = 1; dan <= 9; dan++) {
			for (times = 1; times <= 9; times++) {
				if (dan < times) break;
				
				System.out.println(dan + " X " + times + " = " + dan*times);
			}
			System.out.println();
		}
		
		//2번째 방법: for문 자체에 조건 걸어주기 
		for (dan = 1; dan <= 9; dan++) {
			for (times = 1; times <= dan; times++) {
				System.out.println(dan + " X " + times + " = " + dan*times);
			}
			System.out.println();
		}
	}

}
