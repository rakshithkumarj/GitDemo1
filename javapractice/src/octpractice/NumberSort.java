package octpractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NumberSort {

	public static void main(String[] args) {
		int[] num = { 2, 4, 6, 3, 6, 8, 10, 9, 15, 23, 45, 54, 67 };
		Arrays.sort(num);
		for (int n : num) {
		/*	System.out.println(n);*/
		}

		int temp;
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

	}
}
