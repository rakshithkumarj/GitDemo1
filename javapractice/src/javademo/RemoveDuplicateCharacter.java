package javademo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		System.out.println("Enter the string word to remove duplicate letters");
		Scanner scn= new Scanner(System.in);
	    String s1=scn.next();
		/*String s1="selenium";*/
		Set<Character> set= new HashSet<Character>();
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<s1.length();i++)
		{
			Character c=s1.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}
