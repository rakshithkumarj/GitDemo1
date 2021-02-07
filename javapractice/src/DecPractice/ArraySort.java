package DecPractice;

public class ArraySort {

	public static void main(String[] args) {
		int[] num = { 2, 3, 6, 5, 10, 7, 8, 9, 15 };
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
		System.out.println("second bigest number in a array is" + num[size - 2]);
	}

}
