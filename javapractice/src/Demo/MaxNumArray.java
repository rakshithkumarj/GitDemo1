package Demo;

public class MaxNumArray {

	public static void main(String[] args) {
		int[] num = { 3, 5, 10, 20, 45, 70, 23, 28 };
		int big = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] < big) {
				big = num[i];
			}
		}
		System.out.println(big);

	}

}
