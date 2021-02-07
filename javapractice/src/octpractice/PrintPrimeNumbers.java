package octpractice;

import java.util.ArrayList;
import java.util.List;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		int count = 0;

		for (int i = 2; i <= 100; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println(i);

				li.add(i);
				count++;

			}

		}
		System.out.println(count);
	}

}
