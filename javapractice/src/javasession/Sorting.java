package javasession;

public class Sorting {

	public static void main(String[] args) {
		int[] num = { 10, 30, 20, 60, 40, 25, 15, 50 };
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
		}
		System.out.println(num[size - 2]);
	}
}