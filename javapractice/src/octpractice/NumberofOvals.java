package octpractice;

import java.util.Scanner;

public class NumberofOvals {

	public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	System.out.println("Enter the string");
	String str=scn.nextLine();
	int count = 0;
	char[] chars=str.toCharArray();
	for (char c : chars) {
		
		switch(c)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
		count++;
			
		}
		
	}
System.out.println(count);
	}

}
