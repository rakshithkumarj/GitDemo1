package DecPractice;

public class FirstLastNumSum {

	public static void main(String[] args) {
		int num = 123;
		int lastNum = num % 10;
		int firstNum = num;
		while (firstNum > 10) {
			firstNum = firstNum / 10;
		}
		System.out.println(lastNum + firstNum);
	}

}
