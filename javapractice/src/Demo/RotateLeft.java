package Demo;

public class RotateLeft {

	public static void main(String[] args) {
		int[] num = { 2, 5, 4, 6, 3, 8, 7, 10, 9 };

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
		System.out.println("bigest number is" + num[size - 2]);
	}

}
