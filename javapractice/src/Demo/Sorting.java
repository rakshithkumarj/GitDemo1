package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		int[] num = { 2, 3, 6, 5, 7, 4, 5, 9, 10, 0 };
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
		System.out.println("second highest number is" + num[size - 2]);
	}

}
