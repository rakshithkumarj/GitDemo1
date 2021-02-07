package Test;

import java.util.Scanner;

public class PrintFizzBuzz {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		if (num % 15 == 0) {
			System.out.println("FizBuzz");
		} else if (num % 3 == 0) {
			System.out.println("Fizz");

		} else if (num % 5 == 0) {
			System.out.println("Buzz");
		}
	}

}
