package programs;

public class BigNum {

	public static void main(String[] args) {
		int[] num = { 2, 3, 5, 6, 20, 22, 28, 1, 3, 5 };
		int big = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > big) {
				big = num[i];
			}
		}
		System.out.println(big);
	}

}
