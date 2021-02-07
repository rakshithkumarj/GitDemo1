package logics;

import java.util.ArrayList;
import java.util.List;

public class PrintEvenNum {

	public static void main(String[] args) {
		int count = 0;

		int num = 100;
		for (int i = 0; i <= num; i++) {
			if (i % 2!=0) {
				System.out.println(i);
				count++;
				

			}

		}
		System.out.println(count);
	}

}
