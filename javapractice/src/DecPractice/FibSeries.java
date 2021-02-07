package DecPractice;

public class FibSeries {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int count = 0;

		for (int i = 0; i <= 10; i++) {
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			System.out.println(n1);
			count++;
		}
		System.out.println(n1);
		System.out.println(count);

	}
}