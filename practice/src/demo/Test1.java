package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		int num = 5;
		int prime = 0; // next prime will be assigned to this var

		for (int j = num; j < 15; j++) { // outer loop

			int count = 0;
			for (int i = 2; i <= j / 2; i++) { // inner loop

				if (j % i == 0) {
					count++;
				}
			}

			if (count == 0) {

				prime = j; // assign next prime
				break;

			}

		}

		System.out.println(prime);

	}
}
