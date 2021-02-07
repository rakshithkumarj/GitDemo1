package octpractice;

import java.util.Scanner;

public class DemoPrime {
	
	public static void main(String[] args) {
	boolean prime=true;
	System.out.println("Enter the number");
	Scanner scn= new Scanner(System.in);
	Integer num=scn.nextInt();
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			prime=false;
		}
	}
	
    if(prime==true)
    {
    	System.out.println("Number is Prime");
    }
    else
    {
    	System.out.println("Number is not a prime number");
    }
	}

}
