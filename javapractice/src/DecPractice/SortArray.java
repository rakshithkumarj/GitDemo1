package DecPractice;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] num = { 2, 3, 5, 6, 1, 10, 11, 45, 54, 99 };

		Arrays.sort(num);

		for (int n : num) {
			System.out.println(n);
		}

	}

}
