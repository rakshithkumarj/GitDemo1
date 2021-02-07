package Test;

public class AddFirstLastNum {

	public static void main(String[] args) {
		int num = 123;
		int lastNum = num % 10;

		int firstNum = num;
		while (firstNum > 10) {
			firstNum = firstNum / 10;

		}
		System.out.println("First Number is=" + firstNum);
		System.out.println("First Number is=" + lastNum);
		System.out.println("Sum of First and Last Num is+ " +(firstNum + lastNum));
	}

}
