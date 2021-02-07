package DecPractice;

public class BiggestNumInArray {

	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 50 };
		int temp = num[0];
		for (int i = 1; i < num.length; i++) {
			num[i - 1] = num[i];
		}
		num[num.length - 1] = temp;
		for (int n : num) {
			System.out.println(n);
		}

	}

}
