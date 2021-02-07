package practice;

public class Test3 {

	public static void main(String[] args) {
		int num = 45612378;
		String str = String.valueOf(45612378);
		String modifiedNumber = str.substring(0, 7);
		int intmodifiedNum = Integer.parseInt(modifiedNumber);
		int last_digit = num % 10;
		System.out.println(last_digit);
		System.out.println(modifiedNumber);
		int tempNum=intmodifiedNum-last_digit;
		System.out.println(tempNum);

	}

}
