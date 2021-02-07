package Demo;

public class PrintPrimeNum {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i <= 100; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;

				}
			}
			if (prime) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("total number of prime=" + count);
	}

}
