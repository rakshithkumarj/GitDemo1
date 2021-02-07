package abstraction;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		boolean prime =true;
		System.out.println("Enter the Number");
		Scanner scn= new Scanner(System.in);
		int num=scn.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				prime=false;
			}		
		}
		if(prime==true)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}

}
