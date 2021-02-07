package octpractice;

import java.util.Scanner;

public class FirstLastdigitSum {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the numer");
		int number= scn.nextInt();
		int lastDigit=number%10;
		int firstDigit=number;
		while(firstDigit>=10)
		{
			firstDigit=firstDigit/10;
		}
		System.out.println(firstDigit); 
		System.out.println(lastDigit);
		System.out.println("Sum of First and Last Digit is::"+(firstDigit+lastDigit));
	}

}
