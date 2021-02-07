package DecPractice;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[] num = { 5, 3, 4, 7, 10, 9, 5, 4, 8 };
		int temp;
		int size = num.length;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.println(num[i]);
		}
		System.out.println("biggest number in a array is=" + num[size - 2]);

	}

}
