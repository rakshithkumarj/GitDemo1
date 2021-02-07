package Test;

public class ArraySort {

	public static void main(String[] args) {
		int[] num = { 2, 5, 3, 10, 8, 6, 4, 1, 0 };
		int temp;

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] >num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.println(num[i]);
		}
	
	}

}
