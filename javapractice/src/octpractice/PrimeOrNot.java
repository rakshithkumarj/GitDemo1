package octpractice;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		 boolean prime= true;
		Scanner scn= new Scanner( System.in);
	    System.out.println("Enter the number");
	    int num= scn.nextInt();
	    for(int i=2;i<num;i++)
	    {
	    	if(num%i==0)
	    	{
	    		prime= false;
	    	}
	    }
	    if(prime==true)
	    {
	    	System.out.println("Prime number");
	    }
	    else
	    {
	    	System.out.println( "Number is not prime");
	    }

	}

}
